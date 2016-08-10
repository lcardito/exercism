package me.lcardito.hackerrank.sharlock;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        in.nextLine();

        ArrayList<int[]> inputs = new ArrayList<>();
        while (tests > 0) {
            int n = in.nextInt();
            in.nextLine();

            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = in.nextInt();
            }
            inputs.add(input);
            tests--;
        }
        in.close();

        inputs.stream().forEach(x -> {
            if (x.length == 1 || exist(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        });
    }

    private static boolean exist(int[] input) {

        int leftIndex = 0, rightIndex = input.length - 1;
        int leftSum = 0 , rightSum = 0;

        while (leftIndex < rightIndex) {
            if (leftSum > rightSum)
                rightSum = rightSum + input[rightIndex--];
            else
                leftSum = leftSum + input[leftIndex++];
        }

        return leftSum == rightSum;
    }
}
