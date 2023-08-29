package com.keyon.algo.Ali;

import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] cardIndexs = new int[10000004]; // card index start from 1
        int minD = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = cin.nextInt();
            if (cardIndexs[num] == 0) {
                cardIndexs[num] = i;
            } else { // update index
                minD = Math.min(minD, i - cardIndexs[num] + 1);
                cardIndexs[num] = i;
            }
        }
        System.out.println(minD);
    }
}
