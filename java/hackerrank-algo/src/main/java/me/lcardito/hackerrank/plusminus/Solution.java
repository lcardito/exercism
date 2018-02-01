package me.lcardito.hackerrank.plusminus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.valueOf(in.readLine());
        List<Integer> numbers = Arrays.stream(in.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

        double positiveFraction = 0;
        double negativeFraction = 0;
        double zeroFraction = 0;

        for (Integer i : numbers) {
            if (i > 0) {
                positiveFraction++;
            } else if (i < 0) {
                negativeFraction++;
            } else {
                zeroFraction++;
            }
        }

        DecimalFormat df = new DecimalFormat("#.000000");
        System.out.println(df.format(positiveFraction / size));
        System.out.println(df.format(negativeFraction / size));
        System.out.println(df.format(zeroFraction / size));
    }
}
