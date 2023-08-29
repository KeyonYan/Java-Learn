package com.keyon.algo.Mihoyo3;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int win = 0;
        int[] minPre = new int[n];
        minPre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            minPre[i] = Math.min(i, minPre[i-1]);
        }

        for (int start = 1; start < n; start++) {
            if (minPre[start] < arr[start]) {
                win++;
            }
        }

        System.out.println(win + "/" + n);
    }
}
