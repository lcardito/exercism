import java.util.HashMap;
import java.util.Map;

public class DNA {

    private final String sequence;
    private final HashMap<Character, Integer> nucleotideMapping;

    public DNA(String sequence) {
        this.sequence = sequence;
        nucleotideMapping = new HashMap<>();
        nucleotideMapping.put('A', 0);
        nucleotideMapping.put('C', 0);
        nucleotideMapping.put('G', 0);
        nucleotideMapping.put('T', 0);
    }

    public long count(char a) {
        if (!nucleotideMapping.containsKey(a)) {
            throw new IllegalArgumentException();
        }
        return sequence.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> c == a).count();
    }

    public Map<Character, Integer> nucleotideCounts() {
        sequence.chars()
                .mapToObj(i -> (char) i)
                .forEach(
                        c -> nucleotideMapping.put(c, nucleotideMapping.get(c) + 1)
                );

        return nucleotideMapping;
    }
}
