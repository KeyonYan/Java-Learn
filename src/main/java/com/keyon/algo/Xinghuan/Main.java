package com.keyon.algo.Xinghuan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // int[] dp = new int[n];
        // dp[i]: i个房屋所能偷盗的最高金额
        // dp[i]: dp[i-2]
        int[] nums = new int[] {1};
        int n = nums.length;
        if (n == 1) {
            System.out.println(nums[0]);
            return;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n-1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        int ans1 = dp[n-2];
        dp[0] = 0;
        dp[1] = nums[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }
        int ans2 = dp[n-1];
        System.out.println(Math.max(ans1, ans2));
    }
}
