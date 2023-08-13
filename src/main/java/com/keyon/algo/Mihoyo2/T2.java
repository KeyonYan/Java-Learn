package com.keyon.algo.Mihoyo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T2 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 树节点数
        int k = cin.nextInt();
        HashMap<Integer, List<Integer>> edges = new HashMap<>();
        // init
        for (int i = 0; i < n; i++) {
            edges.put(i, new ArrayList<>());
        }
        // edges
        for (int i = 0; i < n - 1; i++) {
            int start = cin.nextInt() - 1;
            int end = cin.nextInt() - 1;
            edges.get(start).add(end);
        }
        // solution
        // get depth of every leaf node
        dfs(edges, 0, 0, k);
        System.out.println(res);
    }

    public static void dfs(HashMap<Integer, List<Integer>> edges, int root, int len, int k) {
        if (len <= k) res++; // 深度不超过k的源节点，加上当前节点
        if (edges.get(root).size() == 0) {
            if (len < k) {
                res += k - len; // 深度不超过k的叶子节点，加上需要补充的节点
            }
            return;
        }
        for (int i = 0; i < edges.get(root).size(); i++) {
            dfs(edges, edges.get(root).get(i), len + 1, k);
        }
    }

}
