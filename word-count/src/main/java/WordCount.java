import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {

    public Map<String, Integer> phrase(String word) {
        return Stream.of(word.replaceAll("[^a-zA-Z1-9 ]", "").toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(w -> 1)));
    }
}
