package com.keyon.algo.JuRenWangLuo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T1 {
    static int[][] graph;
    static int n;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Integer> numbers = parseNumber("{{0, 1}, {1, 0}, {2, 3}, {2, 0}, {5, 6}}");
        graph = new int[n][n];
        for (int i = 0; i < numbers.size(); i+=2) {
            int start = numbers.get(i);
            int end = numbers.get(i+1);
        }
    }

    private static List<Integer> parseNumber(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            int v = Integer.parseInt(matcher.group());
            n = Math.max(n, v);
            numbers.add(v);
        }
        return numbers;
    }
}
