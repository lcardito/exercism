package me.lcardito.hackerrank.code.eleven;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 5; j++){
                int sum = 0;
                System.out.printf("\n%d %d %d\n  %d \n%d %d %d\n",
                        arr[i - 1][j - 1], arr[i - 1][j], arr[i - 1][j + 1],
                            arr[i][j],
                        arr[i + 1][j - 1], arr[i + 1][j], arr[i + 1][j + 1]);

                sum +=  arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1]
                        + arr[i][j]
                        + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);

    }
}
