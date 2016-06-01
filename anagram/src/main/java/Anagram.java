import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.Math.toIntExact;

public class Anagram {

    private final String diaper;

    public Anagram(String diaper) {
        this.diaper = diaper;
    }

    public List<String> match(List<String> strings) {
        ArrayList<String> result = new ArrayList<>();
        for (String current : strings) {
            String diaperLowerCase = diaper.toLowerCase();
            String currentLowerCase = current.toLowerCase();

            if (diaperLowerCase.equals(currentLowerCase)) {
                continue;
            }

            Map<Character, Integer> diaperOccurrences = getCharsOccurrences(diaperLowerCase);
            Map<Character, Integer> currentOccurrences = getCharsOccurrences(currentLowerCase);

            if (diaperOccurrences.equals(currentOccurrences)) {
                result.add(current);
            }

        }
        return result;
    }

    private Map<Character, Integer> getCharsOccurrences(String diaper) {
        return diaper.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> toIntExact(diaper.chars().mapToObj(i -> (char) i).filter(c2 -> c2 == c).count()),
                        (char1, char2) -> char1
                ));
    }
}
