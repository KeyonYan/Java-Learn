package com.keyon.algo.Xiaohongshu.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String str = cin.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            Character c = str.charAt(i);
            int charIndex = c - 'a' - 3;
            if (c < 'd') {
                charIndex = 26 + charIndex;
                sb.append((char) ('a' + charIndex));
            } else {
                sb.append((char) ('a' + charIndex));
            }

        }
        System.out.println(sb.toString());
    }
}
