package com.keyon.algo.MeiTuan2.T5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 天数
        int k = cin.nextInt(); // 机会
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = cin.nextInt();
        }
        int[][] dp = new int[n+1][k+2]; // dp[i][j]: 第i天，还有j次机会的最大美味值
        dp[0][k] = 0;
        dp[1][k] = values[0];
        dp[2][k] = Math.max(values[0], values[1]);
        for (int i = 2; i < n; i++) {
            for (int j = k; j >= 0; j--) {
                int v1 = dp[i-1][j]; // 不吃
                int v2 = dp[i-2][j] + values[i]; // 不使用机会吃
                int v3 = dp[i-1][j+1] + values[i]; // 使用机会吃
                dp[i][j] = Math.max(v1, Math.max(v2,v3));
            }
        }
        System.out.println(dp[n][0]);
    }
}
