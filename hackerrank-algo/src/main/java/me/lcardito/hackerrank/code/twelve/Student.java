package me.lcardito.hackerrank.code.twelve;

import java.util.Arrays;

public class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public String calculate() {
        String grade = "";
        double avg = Arrays.stream(testScores).average().orElse(0);

        if (isOGrade(avg)) {
            grade = "O";
        } else if (isEGrade(avg)) {
            grade = "E";
        } else if (isAGrade(avg)) {
            grade = "A";
        } else if (isPGrade(avg)) {
            grade = "P";
        } else if (isDGrade(avg)) {
            grade = "D";
        } else if (isTGrade(avg)) {
            grade = "T";
        }

        return grade;
    }

    private boolean isTGrade(double avg) {
        return avg < 40;
    }

    private boolean isDGrade(double avg) {
        return avg >= 40 && avg <= 55;
    }

    private boolean isPGrade(double avg) {
        return avg >= 55 && avg <= 70;
    }

    private boolean isAGrade(double avg) {
        return avg >= 70 && avg < 80;
    }

    private boolean isEGrade(double avg) {
        return avg >= 80 && avg < 90;
    }

    private boolean isOGrade(double a) {
        return a >= 90 && a <= 100;
    }
}
