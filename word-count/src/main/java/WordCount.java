import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> phrase(String word) {
        return Arrays.asList(word.replaceAll("[^a-zA-Z1-9 ]", "").toLowerCase().split("\\s+"))
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(w -> 1)));
    }
}
