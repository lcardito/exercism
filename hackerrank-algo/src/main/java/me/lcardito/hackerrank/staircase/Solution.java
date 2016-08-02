package me.lcardito.hackerrank.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(in.readLine());

        IntStream.range(0, size).forEach(i -> {
            IntStream.range(1, size - i).forEach(j -> System.out.print(" "));

            IntStream.rangeClosed(size - i, size).forEach(j -> System.out.print("#"));

            System.out.println();
        });
    }
}
