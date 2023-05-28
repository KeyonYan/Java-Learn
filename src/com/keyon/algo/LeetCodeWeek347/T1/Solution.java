package com.keyon.algo.LeetCodeWeek347.T1;

public class Solution {

    public static void main(String[] args) {
        String str = "120300";
        // 去除尾导零
        System.out.println(str.replaceAll("0*$", ""));
    }
}
