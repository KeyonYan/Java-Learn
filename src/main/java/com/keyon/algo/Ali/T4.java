package com.keyon.algo.Ali;

import java.util.Scanner;

public class T4 {
    final static int[][] dir = {{0,1}, {0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt(); // 数据组数
        for (int k = 0; k < T; k++) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int X = cin.nextInt(); // 能力值
            boolean[][] world = new boolean[n][m]; // 异世界 true(安全) false(危险)
            boolean[][] visit = new boolean[n][m]; // 是否访问过
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    world[i][j] = X >= cin.nextInt();
                }
            }
            int res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (world[i][j] && !visit[i][j]) {
                        dfs(world, visit, i, j, n, m, X);
                        res++;
                    }
                }
            }
            if (res == 0) {
                System.out.println("Orz");
            } else {
                System.out.println(res);
            }
        }
    }

    public static void dfs(boolean[][] world, boolean[][] visit, int i, int j, int n, int m, int X) {
        visit[i][j] = true;
        for (int[] d : dir) {
            int nx = i + d[0];
            int ny = j + d[1];
            if (inBorad(n, m, nx, ny) && !visit[nx][ny] && world[nx][ny]) {
                dfs(world, visit, nx, ny, n, m, X);
            }
        }
    }

    public static boolean inBorad(int n, int m, int i, int j) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
