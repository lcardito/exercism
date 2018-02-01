package me.lcardito.hackerrank.code.seven;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }

        in.close();

        IntStream.iterate(n - 1, i -> i - 1)
                .limit(n)
                .forEach(i -> System.out.printf("%d ", arr[i]));
    }
}
