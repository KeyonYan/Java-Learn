package com.keyon.algo.MeiTuan.M5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 节点数量
        int[] engDis = new int[n]; // 每个节点所能提供的能量最远距离
        for (int i = 0; i < n; i++) {
            engDis[i] = cin.nextInt();
        }
        boolean[][] g = new boolean[n][n]; // 邻接矩阵 无向图
        for (int i = 1; i < n; i++) {
            int n1 = cin.nextInt() - 1;
            int n2 = cin.nextInt() - 1;
            g[n1][n2] = true;
            g[n2][n1] = true;
        }
        // solution
        int[] ans = new int[n]; // 最终能量值
        // [0,1,0]
        // [1,0,1]
        // [0,1,0]
        // engDis: 1 1 1
        // 改造成描述距离的矩阵
        // [0,1,2]
        // [1,0,1]
        // [2,1,0]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
        }

        System.out.println(ans);
    }
}
