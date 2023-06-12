package com.keyon.algo.Xiaohongshu2.T1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static boolean[] vis;
    static boolean[][] g;
    static int min = Integer.MAX_VALUE, cnt = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new FileInputStream("src/com/keyon/algo/Xiaohongshu2/T1/input2.txt"));
//        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 节点个数
        if (n < 3) {
            System.out.println("0 1");
            return;
        }
        g = new boolean[n][n];
        for (int i = 0; i < n-1; i++) {
            int s = cin.nextInt() - 1; // 节点s
            int t = cin.nextInt() - 1; // 节点s的父节点
            g[t][s] = true;
            g[s][t] = true;
        }
        // 枚举n-1条边，挨个删除
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (g[i][j]) {
                    vis = new boolean[n];
                    g[i][j] = false; // 删除该边
                    g[j][i] = false; // 删除该边
                    int num = dfs(i); // 从其中一个节点遍历可达节点的数量
                    int v = Math.abs(n - num * 2);
                    if (v < min) {
                        min = v;
                        cnt = 1;
                    } else if (v == min) {
                        cnt++;
                    }
                    g[i][j] = true; // 恢复
                    g[j][i] = true; // 恢复
                }
            }
        }
        System.out.println(min + " " + cnt);
    }

    private static int dfs(int i) {
        if (vis[i]) return 0;
        vis[i] = true;
        int num = 1;
        for (int j = 0; j < g.length; j++) {
            if (!vis[j] && g[i][j]) {
                num = num + dfs(j);
            }
        }
        return num;
    }
}
