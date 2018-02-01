import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordCount {

    public Map<String, Integer> phrase(String phrase) {
        return Pattern.compile("\\W+").splitAsStream(phrase.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(w -> 1)));
    }
}
