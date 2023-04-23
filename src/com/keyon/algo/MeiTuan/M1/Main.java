package com.keyon.algo.MeiTuan.M1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a = cin.nextInt();
        int b = cin.nextInt();
        int ans = 1;
        int[][] pos = new int[n][2];
        for (int i = 0; i < n; i++) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            pos[i][0] = x;
            pos[i][1] = y;
        }
        // enum, compare pos[i]
        for (int i = 0; i < n; i++) {
            int curMax = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) break;
                int diffX = Math.abs(pos[i][0] - pos[j][0]);
                int diffY = Math.abs(pos[i][1] - pos[j][1]);
                if (diffX <= a && diffY <= b) {
                    curMax++;
                }
            }
            ans = Math.max(ans, curMax);
        }
        System.out.println(ans);
    }

}
