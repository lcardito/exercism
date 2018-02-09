import com.google.common.collect.ImmutableMap;

import java.util.Map;

import static java.util.stream.Collectors.joining;

class RnaTranscription {

    private final Map<String, String> dnaToRna;

    RnaTranscription() {
        this.dnaToRna = ImmutableMap.of(
                "G","C",
                "C","G",
                "T","A",
                "A","U"
        );
    }

    String transcribe(String dnaStrand) {
        return dnaStrand
                .chars()
                .mapToObj(i -> dnaToRna.get(Character.toString((char) i)))
                .collect(joining());
    }

}
