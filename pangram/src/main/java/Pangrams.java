import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pangrams {
    private static List<String> alphabet = IntStream.rangeClosed('a','z').mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());

    public static boolean isPangram(String input) {
        return input.replaceAll("[^a-zA-Z]", "").toLowerCase().chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .sorted()
                .collect(Collectors.toList())
                .equals(alphabet);
    }
}
