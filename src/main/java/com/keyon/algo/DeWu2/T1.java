package com.keyon.algo.DeWu2;

import java.util.Scanner;

public class T1 {
    static int n;
    static int[] arr;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int[][] dp = new int[2][n];
        dp[1][0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[1][i-1], dp[0][i-1]);
            dp[1][i] = dp[0][i-1] + arr[i];
            if (i >= 2) {
                dp[1][i] = Math.max(dp[1][i], dp[0][i-2] + arr[i]);
            }
        }
        System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
    }

    public static void main0(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int[][] dp = new int[2][n];
        dp[1][0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = Math.max(dp[1][i-1], dp[0][i-1]);
            dp[1][i] = dp[0][i-1] + arr[i];
            if (i >= 2) {
                dp[1][i] = Math.max(dp[1][i], dp[0][i-2] + arr[i]);
            }
        }
        System.out.println(Math.max(dp[0][n-1], dp[1][n-1]));
    }
    public static void main2(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int res = Math.max(dfs(0), dfs(1));
        System.out.println(res);
    }
    private static int dfs(int i) {
        if (i >= n) return 0;
        return arr[i] + Math.max(dfs(i+2), dfs(i+3));
    }
}
