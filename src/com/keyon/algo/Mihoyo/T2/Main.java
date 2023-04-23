package com.keyon.algo.Mihoyo.T2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int q = cin.nextInt();
        for (int i = 0; i < q; i++) {
            String oriStr = cin.next();
            String tarStr = cin.next();
            if (judge(oriStr, tarStr)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    // mhy插入可以不连续
    // [mh]bd[y] -> bd
    // [mh]bd[y] -> bd -> [mh][m]b[h]d[y][y] -> bd
    // mhy -> abc
    private static boolean judge(String oriStr, String tarStr) {
        // 如果目标字符串存在mhy之外的字符，而原字符串没有，则一定为false
        for (int i = 0; i < tarStr.length(); i++) {
            if (findMhy(tarStr.charAt(i)) == 0) {
                if (!oriStr.contains(Character.toString(tarStr.charAt(i)))) {
                    return false;
                }
            }
        }
        // 删除目标字符串的mhy
        String tarDstr = deleteMhy(tarStr);
        // 删除原字符串的mhy
        String oriDStr = deleteMhy(oriStr);
        // 对比是否相等
        if (tarDstr.equals(oriDStr)) {
            return true;
        } else {
            return false;
        }
    }

    private static String deleteMhy(String str) {
        StringBuilder sb = new StringBuilder();
        int[] count = new int[4]; // m h y 字符的计数，如果不等，直接为No
        for (int i = 0; i < str.length(); i++) {
            int k = findMhy(str.charAt(i));
            if (k > 0) {
                count[k]++;
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    private static int findMhy(char c) {
        if (c == 'm') return 1;
        if (c == 'h') return 2;
        if (c == 'y') return 3;
        return 0;
    }

}
