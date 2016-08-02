package me.lcardito.hackerrank.triplets;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();

        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        Integer aScore = 0;
        Integer bScore = 0;

        getScore(a0, b0, aScore, bScore);
        getScore(a1, b1, aScore, bScore);
        getScore(a2, b2, aScore, bScore);

        System.out.print(aScore + " " + bScore);
    }

    private static void getScore(int a, int b, Integer aScore, Integer bScore) {
        if (a > b) {
            ++aScore;
        } else if (a < b) {
            ++bScore;
        }
    }
}
