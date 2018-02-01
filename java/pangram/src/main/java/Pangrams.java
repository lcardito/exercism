import java.util.stream.IntStream;

public class Pangrams {

    public static boolean isPangram(String input) {
        return IntStream.rangeClosed('a', 'z').allMatch(c -> input.toLowerCase().indexOf(c) != -1);
    }
}
