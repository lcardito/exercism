package me.lcardito.hackerrank.code.ten;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char[] binaryArray = Integer.toBinaryString(n).toCharArray();
        System.out.println(binaryArray);

        int count = 0;
        int max = 0;
        for (char c : binaryArray) {
            if (c == '1') {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
