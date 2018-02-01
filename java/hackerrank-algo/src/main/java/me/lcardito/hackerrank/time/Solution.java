package me.lcardito.hackerrank.time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

        Date inputDate = inputFormat.parse(in.readLine());

        System.out.println(outputFormat.format(inputDate));
    }
}
