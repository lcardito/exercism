package me.lcardito.hackerrank.library;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d M yyyy");

        Scanner in = new Scanner(System.in);
        LocalDate returned = LocalDate.parse(in.nextLine(), formatter);
        LocalDate expected = LocalDate.parse(in.nextLine(), formatter);

        int fine = 0;
        if (returned.isBefore(expected)) {
            fine = 0;
        } else if (returned.getYear() > expected.getYear()) {
            fine = 10000;
        } else if (returned.getMonthValue() > expected.getMonthValue()) {
            fine = 500 * (returned.getMonthValue() - expected.getMonthValue());
        } else if (returned.getDayOfMonth() > expected.getDayOfMonth()) {
            fine = 15 * (returned.getDayOfMonth() - expected.getDayOfMonth());
        }

        System.out.println(fine);
    }
}
