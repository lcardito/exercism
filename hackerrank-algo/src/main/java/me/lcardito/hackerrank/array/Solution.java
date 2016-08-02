package me.lcardito.hackerrank.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.stream.Collectors.summingInt;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.valueOf(in.readLine());
        Integer sum = in.readLine()
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .limit(size)
                .collect(summingInt(Integer::valueOf));

        System.out.println(sum);
    }
}
