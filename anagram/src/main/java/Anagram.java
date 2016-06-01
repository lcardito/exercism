import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private final String diaper;

    public Anagram(String diaper) {
        this.diaper = diaper;
    }

    public List<String> match(List<String> strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String current : strings) {
            if (current.length() != diaper.length()) {
                continue;
            }
            List<Character> wantedChars = diaper.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
            List<Character> actualChars = current.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

            if (actualChars.containsAll(wantedChars)) {
                result.add(current);
            }

        }
        return result;
    }
}
