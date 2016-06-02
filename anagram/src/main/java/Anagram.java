import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private final String input;

    public Anagram(String input) {
        this.input = input;
    }

    public List<String> match(List<String> strings) {
        String sortedInput = sort(input);
        return strings.stream()
                .filter(s -> !s.equalsIgnoreCase(input))
                .filter(s -> s.length() == input.length())
                .filter(s -> sortedInput.equals(sort(s)))
                .collect(Collectors.toList());
    }

    private String sort(String in) {
        return in.toLowerCase()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted().collect(Collectors.joining());
    }
}
