package com.keyon.algo.MeiTuan2.T3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 巧克力数量
        int m = cin.nextInt(); // 询问次数
        int[] weight = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int v = cin.nextInt();
            weight[i] = v * v;
        }
        for (int i = 0; i < m; i++) {
            int packageSize = cin.nextInt();
            System.out.println(solution(n, weight, packageSize));
        }

    }

    private static int solution(int n, int[] weight, int packageSize) {
        int[][] dp = new int[n+1][packageSize+1]; // 重量
        int[][] dp2 = new int[n+1][packageSize+1]; // 块数

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= packageSize; j++) {
                dp[i][j] = dp[i-1][j];
                dp2[i][j] = dp2[i-1][j];
                if (j >= weight[i]) {
                    if (dp[i][j] <= dp[i-1][j-weight[i]] + weight[i]) {
                        dp[i][j] = dp[i-1][j-weight[i]] + weight[i];
                        dp2[i][j] = dp2[i-1][j-weight[i]] + 1;
                    }
                }
            }
        }
        return dp2[n][packageSize];
    }
}
