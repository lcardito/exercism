package me.lcardito.hackerrank.code.twelve;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoublePredicate;
import java.util.function.Function;

public class Student extends Person {
    private int[] testScores;
    private static final Map<DoublePredicate, String> GRADE_RULES = new HashMap<>();

    static {
        DoublePredicate isOGrade = a -> a >= 90 && a <= 100;
        DoublePredicate isEGrade = a -> a >= 80 && a < 90;
        DoublePredicate isAGrade = a -> a >= 70 && a < 80;
        DoublePredicate isPGrade = a -> a >= 55 && a <= 70;
        DoublePredicate isDGrade = a -> a >= 40 && a <= 55;
        DoublePredicate isTGrade = a -> a < 40;

        GRADE_RULES.put(isOGrade, "O");
        GRADE_RULES.put(isEGrade, "E");
        GRADE_RULES.put(isAGrade, "A");
        GRADE_RULES.put(isPGrade, "P");
        GRADE_RULES.put(isDGrade, "D");
        GRADE_RULES.put(isTGrade, "T");
    }


    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public String calculate() {
        double avg = Arrays.stream(testScores).average().orElse(0);

        DoublePredicate result = GRADE_RULES.keySet().stream().filter(p -> p.test(avg)).findFirst().orElse(null);

        return GRADE_RULES.getOrDefault(result, "T");
    }

    private final Function getGrade = (Function) o -> null;
}
