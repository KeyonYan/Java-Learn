package com.keyon.algo.NingMengWeiQu;

import java.util.HexFormat;
import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        String x = cin.next();
        System.out.println(encode(n));
        System.out.println(decode(x));
    }
    private static String encode(long n) {
        long bit7 = n & 0b1111111;
        if (n == 0) {
            return "";
        }
        if (n > 0x7F) {
            bit7 |= 0b10000000;
        }
        String sub = Long.toHexString(bit7).toUpperCase();
        if (sub.length() == 1) {
            sub = "0" + sub;
        }
        return "0X" + sub + encode(n >> 7);
    }
    private static long decode(String x) {
        String[] split = x.split("0X");
        long res = 0;
        for (int i = 1; i < split.length; i++) {
            long sub = Long.parseLong(split[i], 16); // E7
            long bit7 = sub & 0b1111111; // low 7 bit
            res |= (bit7 << (7 * (i-1)));
            boolean over = (sub & 0b10000000) == 0;
            if (over) break;
        }
        return res;
    }
}

