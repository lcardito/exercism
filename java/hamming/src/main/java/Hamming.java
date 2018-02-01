import java.util.stream.IntStream;

import static java.lang.Math.toIntExact;

public class Hamming {
    public static Integer compute(String firstSequence, String secondSequence) {
        if (firstSequence.length() != secondSequence.length()) {
            throw new IllegalArgumentException();
        }
        System.out.println(firstSequence);
        System.out.println(secondSequence);
        return toIntExact(IntStream.range(0, firstSequence.length())
                .filter(i -> {
                    boolean sameChar = firstSequence.charAt(i) != secondSequence.charAt(i);
                    if (sameChar){
                        System.out.print("^");
                    } else {
                        System.out.print(" ");
                    }

                    return sameChar;})
                .count());
    }
}
