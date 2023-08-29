package com.keyon.algo.WeiLai;

import java.util.Scanner;

public class T1 {
    static int[][] tree;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 二叉树节点数
        int root = cin.nextInt(); // 根节点
        tree = new int[500001][3]; // 树
        for (int i = 0; i < n; i++) {
            int parent = cin.nextInt();
            int left = cin.nextInt();
            int right = cin.nextInt();
            tree[parent][0] = left;
            tree[parent][1] = right;
            tree[left][2] = parent;
            tree[right][2] = parent;
        }
        int query = cin.nextInt(); // 查询节点
        int res = succeed(query);
        System.out.println(res);
    }
    private static int succeed(int node) {
        if (tree[node][1] != 0) { // 有右节点
            node = tree[node][1];
            while (tree[node][0] != 0) { // 获取右子树的最左节点
                node = tree[node][0];
            }
        } else {
            while (tree[tree[node][2]][0] != node) { // 如果该节点为父节点的右节点
                node = tree[node][2];
                if (tree[node][2] == 0) { // 如果该节点为根节点
                    break;
                }
            }
            node = tree[node][2];
        }
        return node;
    }
}
