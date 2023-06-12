package com.keyon.algo.Mihoyo.T1;

import java.util.Scanner;

public class Main {
    final static int[][] dir = {{0,1}, {0,-1},{1,0},{-1,0}};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        char[][] g = new char[n][m];
        for (int i = 0; i < n; i++) {
            String tmp = cin.next();
            for (int j = 0; j < m; j++) {
                g[i][j] = tmp.charAt(j);
            }
        }
        int myAns = find(g, n, m);
        // B和G合并后
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (g[i][j] == 'G') {
                    g[i][j] = 'B';
                }
            }
        }
        int miAns = find(g, n, m);
        System.out.println(myAns - miAns);
    }

    private static int find(char[][] g, int n, int m) {
        boolean[][] vis = new boolean[n][m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j]) {
                    dfs(vis, g, i, j, n, m, g[i][j]);
                    ans++;
                }
            }
        }
        return ans;
    }

    private static void dfs(boolean[][] vis, char[][] g, int x, int y, int n, int m, char color) {
        vis[x][y] = true;
        // 四个方向搜
        for (int i = 0; i < dir.length; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if (inBoard(n, m, nx, ny) && !vis[nx][ny] && color == g[nx][ny]) {
                dfs(vis, g, nx, ny, n, m, color);
            }
        }
    }

    private static boolean inBoard(int n, int m, int i, int j) {
        if (i < 0) return false;
        if (j < 0) return false;
        if (i >= n) return false;
        if (j >= m) return false;
        return true;
    }
}
