package me.lcardito.hackerrank.circular;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] firstLine = sc.nextLine().split("\\s+");

        int n = Integer.valueOf(firstLine[0]);
        int k = Integer.valueOf(firstLine[1]);
        int q = Integer.valueOf(firstLine[2]);

        LinkedList<Integer> array = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::valueOf).boxed().limit(n).collect(Collectors.toCollection(LinkedList<Integer>::new));

        while (k > 0) {
            Integer lastElement = array.pollLast();
            array.add(0, lastElement);
            k--;
        }

        ArrayList<Integer> queries = new ArrayList<>();
        while (q > 0) {
            queries.add(sc.nextInt());
            sc.nextLine();
            q--;
        }

        for (int i : queries) {
            System.out.println(array.get(i));
        }
    }
}
