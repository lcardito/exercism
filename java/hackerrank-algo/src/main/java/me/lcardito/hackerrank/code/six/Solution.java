package me.lcardito.hackerrank.code.six;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        in.nextLine();

        List<String> inputs = new ArrayList<>();
        while (tests > 0) {
            inputs.add(in.nextLine());
            tests--;
        }

        for (String input : inputs) {
            StringBuilder result = new StringBuilder(input.length() + 1);
            result.append(appendIf(input, x -> x % 2 == 0));
            result.append(" ");
            result.append(appendIf(input, x -> x % 2 == 1));

            System.out.println(result.toString());
        }

    }

    private static StringBuilder appendIf(String input, IntPredicate predicate) {
        return IntStream.range(0, input.length())
                .filter(predicate)
                .map(input::charAt)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append);
    }
}
