import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private final String diaper;

    public Anagram(String diaper) {
        this.diaper = diaper;
    }

    public List<String> match(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.equalsIgnoreCase(diaper))
                .filter(s -> s.length() == diaper.length())
                .filter(s -> sort(diaper).equals(sort(s)))
                .collect(Collectors.toList());
    }

    private String sort(String in) {
        return in.toLowerCase()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .sorted().collect(Collectors.joining());
    }
}
