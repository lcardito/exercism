package me.lcardito.hackerrank.code.loop;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        IntStream.rangeClosed(1, 10)
                .forEachOrdered(x -> System.out.printf("%d x %d = %d\n", n, x, n * x));

        in.close();
    }
}
