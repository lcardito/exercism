package me.lcardito.hackerrank.diagonal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(in.readLine());

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for(int i = 0; i < n; i++) {
            List<Integer> row = Arrays.stream(in.readLine().split("\\s+"))
                    .mapToInt(Integer::valueOf)
                    .boxed()
                    .collect(Collectors.toList());

            firstDiagonalSum += row.get(i);
            secondDiagonalSum += row.get((n - 1) - i);
        }

        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));
    }
}