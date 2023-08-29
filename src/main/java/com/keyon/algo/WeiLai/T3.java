package com.keyon.algo.WeiLai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {
    static int maxPath = Integer.MIN_VALUE;
    static boolean[][] tree;
    static boolean[] visit;
    static int[] vals;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 二叉树节点数
        tree = new boolean[n][n]; // 树
        visit = new boolean[n];
        vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = cin.nextInt();
        }
        cin.nextInt(); // read 0
        for (int i = 1; i < n; i++) {
            int parent = cin.nextInt() - 1;
            tree[parent][i] = true;
            tree[i][parent] = true;
        }
        dfs(0, n);
        System.out.println(maxPath);
    }

    private static int dfs(int root, int n) {
        visit[root] = true;
        int subPathsSum = 0;
        int maxSubPath = 0;
        for (int i = 0; i < n; i++) {
            if (!visit[i] && tree[root][i]) {
                int sub = dfs(i, n);
                maxPath = Math.max(maxPath, sub);
                maxSubPath = Math.max(maxSubPath, sub);
                subPathsSum += sub;
            }
        }
        maxPath = Math.max(maxPath, subPathsSum + vals[root]);
        return Math.max(maxSubPath + vals[root], vals[root]);
    }

}
