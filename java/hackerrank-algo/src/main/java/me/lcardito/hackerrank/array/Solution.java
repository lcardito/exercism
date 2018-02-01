package me.lcardito.hackerrank.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.valueOf(in.readLine());
        String[] array = in.readLine().split("\\s+");

        Integer sum = Arrays.stream(array).mapToInt(Integer::valueOf).limit(size).sum();

        System.out.println(sum);
    }
}
