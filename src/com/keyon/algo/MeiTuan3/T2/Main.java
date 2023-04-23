package com.keyon.algo.MeiTuan3.T2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer>[] g;
    static int n, x, y, d, ans;
    static boolean[] inSet, vis;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt(); // 树的节点个数
        g = new List[n];
        Arrays.setAll(g, e->new ArrayList<>());
        // build tree
        for (int i = 0; i < n-1; i++) {
            int node = cin.nextInt() - 1; // 节点改为从0开始
            g[i+1].add(node); // 节点i+1的邻节点
            g[node].add(i+1);

        }
        x = cin.nextInt() - 1;
        y = cin.nextInt() - 1;

        // solution
        // case的最长路径是7-3-4-5-6，边的个数为4
        solution();
    }

    private static void solution() {
        inSet = new boolean[n];
        f(0);
        System.out.println(ans);
    }

    private static void f(int i) {
        if (i == n) {
            // filter
            for (int j = 0; j < n; j++) {
                if (inSet[j] && g[j].size() > 2) {
                    int selectedCount = 0;
                    for (int f : g[j]) {
                        if (inSet[f]) selectedCount++;
                    }
                    if (selectedCount > 2) return; // filter
                }
            }

            for (int v = 0; v < n; ++v) {
                if (inSet[v]) {
                    vis = new boolean[n];
                    d = 0;
                    dfs(v);
                    break;
                }
            }
            if (d > 0 && Arrays.equals(vis, inSet) && inSet[x] && inSet[y]) {
                ans = Math.max(ans, d);
            }
            return;
        }

        // select node i
        inSet[i] = true;
        f(i+1);
        inSet[i] = false;
        // not select node i
        f(i+1);
    }

    // get diameter of tree
    private static int dfs(int x) {
        vis[x] = true;
        int maxLen = 0;
        for (int y : g[x]) {
            if (!vis[y] && inSet[y]) {
                int ml = dfs(y) + 1;
                d = Math.max(d, maxLen + ml);
                maxLen = Math.max(maxLen, ml);
            }
        }
        return maxLen;
    }

}
