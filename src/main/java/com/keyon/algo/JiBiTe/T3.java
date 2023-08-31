package com.keyon.algo.JiBiTe;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {
    static int[] cost;
    static int[][] graph;
    static boolean[] visit;
    static int n;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt(); // 宠物数量
        cost = new int[n]; // 抓取费用
        for (int i = 0; i < n; i++) {
            cost[i] = cin.nextInt();
        }
        int c = cin.nextInt(); // 心灵相通的对数
        graph = new int[n][n];
        // 初始化图的边权值为最大值
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < c; i++) {
            int n1 = cin.nextInt() - 1;
            int n2 = cin.nextInt() - 1;
            int edge = cin.nextInt();
            graph[n1][n2] = edge;
            graph[n2][n1] = edge;
        }
        int res = Integer.MAX_VALUE;
        for (int i = n-1; i >= 0; i--) {
            visit = new boolean[n];
            visit[i] = true; // 不抓第i个
            int curCost = 0;
            for (int j = 0; j < n; j++) {
                if (!visit[j]) {
                    int road = prim(j, i); // 不抓节点i，求从j开始的的最小生成树的边权值和
                    curCost += cost[j] + road;
                }
            }
            res = Math.min(res, curCost);
        }
        System.out.println(res);
    }

    private static int prim(int x, int exclude) {
        int[] adjVex = new int[n]; // 最小生成树的顶点下标
        int[] lowCost = new int[n]; // 最小生成树的边权值
        int min, sum = 0;
        lowCost[x] = 0;
        adjVex[x] = x; // 最小生成树的根 x
        // 初始化
        for (int i = 0; i < n; i++) {
            if (visit[i]) lowCost[i] = 0;
            else lowCost[i] = graph[x][i];
            adjVex[i] = x;
        }
        // 更新adjVex和lowCost
        for (int i = 1; i < n; i++) {
            if (i == exclude) continue;
            min = Integer.MAX_VALUE;
            int j = 1;
            int k = 0;
            // 遍历全部顶点 找出lowcost数组已存储的最小权值
            while (j < n) {
                if (lowCost[j] != 0 && lowCost[j] < min) {
                    min = lowCost[j];
                    k = j; // 将最小权值的下标存入k
                }
                j++;
            }
            if (min == Integer.MAX_VALUE) continue;
            sum += min;
            lowCost[k] = 0;  // 将当前顶点的权值设置为0，表示此顶点已经完成任务，进行下一个顶点的遍历
            visit[k] = true;
            // 邻接矩阵k行逐个遍历全部顶点(k=1,)
            for (j = 1; j < n; j++) {
                if (lowCost[j] != 0 && graph[k][j] < lowCost[j] && !visit[j]) {
                    lowCost[j] = graph[k][j];
                    adjVex[j] = k;
                }
            }
        }
        return sum;
    }
}
