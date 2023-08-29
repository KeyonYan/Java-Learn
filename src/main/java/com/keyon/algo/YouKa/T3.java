package com.keyon.algo.YouKa;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        int N = cin.nextInt();
        final int END = 99999;
        for (int i = M; i <= END && N > 0; i++) {
            String hexString = Integer.toHexString(i); // 16进制
            String octString = Integer.toOctalString(i); // 8进制
            int decSum = sum(String.valueOf(i));
            int hexSum = sum(hexString);
            int octSum = sum(octString);
            if (decSum == octSum && decSum == hexSum) {
                System.out.println(i);
                N--;
            }
        }
    }

    private static int sum(String str) {
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                value += Integer.parseInt(str.substring(i, i + 1));
            } else {
                value += str.charAt(i) - 'a' + 10;
            }
        }
        return value;
    }
}
