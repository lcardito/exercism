import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {

    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> result = new HashMap<>();

        old.forEach((score, letters) ->
                letters.stream().map(String::toLowerCase).forEach(
                        l -> result.put(l, score)
                ));

        return result;
    }
}
