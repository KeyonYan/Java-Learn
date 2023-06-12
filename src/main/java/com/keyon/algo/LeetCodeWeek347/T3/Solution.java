package com.keyon.algo.LeetCodeWeek347.T3;

public class Solution {
    public long minimumCost(String s) {
        // 010101 c
        // 110101 1     dir: left->mid
        // 000101 1+2=3 dir: left->mid
        // 111101 3+3=6 dir: left->mid
        // 111100 6+1=7 dir: right->mid
        // 111111 7+2=9 dir: right->mid
        char[] arr = s.toCharArray();
        int n = arr.length;
        int mid = n/2;
        long cost = 0;
        // left->mid
        char cur = arr[0];
        for (int i = 1; i <= mid; i++) {
            if (cur == arr[i]) continue;
            cost += i;
            // System.out.println(i);
            cur = arr[i];
        }
        cur = arr[n-1];
        // System.out.println("----");
        for (int i = n-2; i >= mid; i--) {
            if (cur == arr[i]) continue;
            cost += (n-i-1);
            // System.out.println(n-i);
            cur = arr[i];
        }
        return cost;
    }
}
