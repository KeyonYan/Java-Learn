package com.keyon.algo.MeiTuan2.T2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n+1]; // 第i天糖果最大值
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        dp[0] = arr[0]; // 第1天
        dp[1] = Math.max(arr[0], arr[1]); // 第2天，
        dp[2] = Math.max(dp[0], dp[1]);
        for (int i = 3; i < n; i++) {
            int v1 = dp[i-3] + arr[i]; // 拿当前的糖果
            int v2 = dp[i-1]; // 不拿当前糖果
            int v3 = dp[i-2]; // 不拿当前糖果
            dp[i] = Math.max(v1, Math.max(v2, v3));
        }
        System.out.println(dp[n-1]);
    }
}
