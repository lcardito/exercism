package me.lcardito.hackerrank.triplets;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();

        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        AtomicInteger aScore = new AtomicInteger(0);
        AtomicInteger bScore = new AtomicInteger(0);

        isAScore(a0, b0, aScore, bScore);
        isAScore(a1, b1, aScore, bScore);
        isAScore(a2, b2, aScore, bScore);

        System.out.print(aScore + " " + bScore);
    }

    private static void isAScore(int a, int b, AtomicInteger aScore, AtomicInteger bScore) {
        if (a > b) {
            aScore.incrementAndGet();
        } else if (a < b) {
            bScore.incrementAndGet();
        }
    }
}
