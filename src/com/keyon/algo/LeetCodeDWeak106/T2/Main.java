package com.keyon.algo.LeetCodeDWeak106.T2;

public class Main {
    public static int longestSemiRepetitiveSubstring(String s) {
        int same = 0;
        int maxLen = 0;
        int start = 0;
        if (s.length() <= 2) return s.length();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                same++;
                if (same > 1) {
                    while(s.charAt(start) != s.charAt(start+1)) {
                        start++;
                    }
                    start++;
                    same--;
                }
            }
            maxLen = Math.max(maxLen, i-start+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestSemiRepetitiveSubstring("4411794"));
    }
}
