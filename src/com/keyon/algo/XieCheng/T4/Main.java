package com.keyon.algo.XieCheng.T4;

import java.util.Scanner;

public class Main {
    static int maxAns;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 节点数量
        int[][] g = new int[n + 1][n + 1]; //  无向有权图(n-1条边) 从1开始
        boolean[][] vis = new boolean[n+1][n+1];
        for (int i = 1; i < n; i++) {
            int u = cin.nextInt();
            int v = cin.nextInt();
            int w = cin.nextInt();
            g[u][v] = w;
            g[v][u] = w;
        }
        // solution
        dfs(1, 0, true, n, g, vis);
        dfs(1, 0, false, n, g, vis);
        System.out.println(maxAns);
    }
    public static void dfs(int start, int weight, boolean putColor, int n, int[][] g, boolean[][] vis) {
        // 遍历邻边并根据putColor决定是否染色
        for (int i = 1; i <= n; i++) {
            if (!vis[start][i] && g[start][i] != 0) {
                vis[start][i] = true;
                vis[i][start] = true;
                if (putColor) {
                    maxAns = Math.max(maxAns, weight + g[start][i]);
                    dfs(i, weight + g[start][i], false, n, g, vis);
                } else {
                    dfs(i, weight, true, n, g, vis);
                }
            }
        }
        return;
    }
}
