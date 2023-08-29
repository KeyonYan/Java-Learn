package com.keyon.algo.Mihoyo3;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T3 {
    static int n;
    static char[] vals;
    static boolean[][] graph;
    static boolean[] visit;
    static int res;
    static char[] findStr = {'m', 'h', 'y'};
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt(); // 节点数
        vals = cin.next().toCharArray(); // 节点值
        graph = new boolean[n][n];
        for (int i = 1; i < n; i++) {
            int a = cin.nextInt() - 1;
            int b = cin.nextInt() - 1;
            graph[a][b] = true;
            graph[b][a] = true;
        }
        for (int i = 0; i < n; i++) {
            visit = new boolean[n];
            if (vals[i] == 'm') {
                dfs(i, 1, 0);
            } else {
                dfs(i, 0, 0);
            }
        }
        System.out.println(res);
    }
    private static void dfs(int x, int findCharIndex, int val) {
        visit[x] = true;
        int newVal = val;
        for (int i = 0; i < n; i++) {
            if (graph[x][i] && !visit[i]) {
                if (vals[i] == findStr[findCharIndex]) {
                    if (findCharIndex == 2) {
                        newVal++;
                    }
                    dfs(i, (findCharIndex+1)%3, newVal);
                } else {
                    dfs(i, 0, newVal);
                }
                res += newVal;
            }
        }
    }
}
