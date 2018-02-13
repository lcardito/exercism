import java.util.stream.IntStream;

import static java.lang.Math.toIntExact;

public class Hamming {
    public static Integer compute(String firstSequence, String secondSequence) {
        if (firstSequence.length() != secondSequence.length()) {
            throw new IllegalArgumentException();
        }
        return toIntExact(IntStream.range(0, firstSequence.length())
                .filter(i -> firstSequence.charAt(i) != secondSequence.charAt(i))
                .count());
    }
}
