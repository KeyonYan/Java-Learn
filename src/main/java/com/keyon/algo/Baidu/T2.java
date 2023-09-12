package com.keyon.algo.Baidu;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = cin.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i] - b[i];
        }
        long max1 = 0, max2 = 0;
        for (int i = 0; i < n; i++) {
            if (d[i] > 0) {
                max1 += d[i];
            } else {
                max2 -= d[i];
            }
        }
        System.out.println(Math.max(max1, max2));
    }
}
