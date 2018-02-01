import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Math.toIntExact;

public class DNA {

    private final String sequence;
    private final List<Character> nucleotides = Arrays.asList('A', 'C', 'G', 'T');

    public DNA(String sequence) {
        this.sequence = sequence;
    }

    public int count(char a) {
        if (!nucleotides.contains(a)) {
            throw new IllegalArgumentException();
        }
        return toIntExact(sequence.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> c == a).count());
    }

    public Map<Character, Integer> nucleotideCounts() {
        return nucleotides.stream()
                .collect(Collectors.toMap(Function.identity(), this::count));
    }
}
