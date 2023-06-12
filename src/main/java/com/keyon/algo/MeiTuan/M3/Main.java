package com.keyon.algo.MeiTuan.M3;

import java.util.Scanner;

public class Main {
    static String ans;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        char[] cstr = new char[str.length()];
        ans = str;
        for (int i = 0; i < str.length(); i++) {
            cstr[i] = str.charAt(i);
        }
        backtrack(cstr, 0, 0);
        System.out.println(ans);
    }
    // 原字符串不一定是回文字符串，先保证回文，再保证字典序最小
    // 从两边到中间回溯
    private static void backtrack(char[] str, int i, int changeTime) {
        int l = i;
        int r = str.length - i - 1;
        // 结束条件
        if (changeTime > 2) return;
        if (l >= r) {
            String sstr;
            if (changeTime == 1 && l == r) {
                str[l] = 'a';
                sstr = new String(str);
            }
            sstr = new String(str);
            if (sstr.compareTo(ans) < 0) {
                ans = sstr;
            }
            return;
        }
        if (str[l] == str[r]) {
            // 不修改当前字符，继续
            backtrack(str, i+1, changeTime);
            // 修改为更小字典序的字符，继续
            char tmp = str[l];
            str[l] = 'a';
            str[r] = 'a';
            backtrack(str, i+1, changeTime+2);
            str[l] = tmp;
            str[r] = tmp;
        } else {
            // 修改为回文字符，继续
            // 1.只修改一端，变为最小字典序的那端
            if (str[l] < str[r]) {
                char tmp = str[r];
                str[r] = str[l];
                backtrack(str, i+1, changeTime+1);
                str[r] = tmp;
            } else if (str[l] < str[r]){
                char tmp = str[l];
                str[l] = str[r];
                backtrack(str, i+1, changeTime+1);
                str[l] = tmp;
            }
            // 2.同时修改两端，都变为a
            // 考虑两种情况，str[l]或str[r] == 'a' 和 != 'a'，可以少修改一次
            char tmp1 = str[l];
            char tmp2 = str[r];
            if (str[l] == 'a') {
                str[r] = 'a';
                backtrack(str, i+1, changeTime+1);
                str[r] = tmp2;
            } else if (str[r] == 'a') {
                str[l] = 'a';
                backtrack(str, i+1, changeTime+1);
                str[l] = tmp1;
            } else {
                str[l] = 'a';
                str[r] = 'a';
                backtrack(str, i+1, changeTime+2);
                str[l] = tmp1;
                str[r] = tmp2;
            }
        }
    }
}
