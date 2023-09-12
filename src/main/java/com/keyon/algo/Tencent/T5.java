package com.keyon.algo.Tencent;

import java.util.Scanner;

public class T5 {
    static int maxVal = 0;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            dfs(arr, 0, k, 0);
        }
        System.out.println(sum-maxVal);
    }
    public static void dfs(Integer[] arr, int index, int k, int val) {
        if (k == 0) return;
        int mask = ~(1 << getPos(arr[index]));
        val += arr[index] - (arr[index] & mask);
        arr[index] &= mask;

        if (arr[index] != 0) dfs(arr, index, k-1, val);
        else dfs(arr, index+1, k-1, val);

        arr[index] |= (1 << getPos(arr[index]));
        maxVal = Math.max(maxVal, val);
    }
    public static int getPos(Integer x) {
        int pos = 0;
        while ((x & 1) == 0) {
            pos++;
            x >>= 1;
        }
        return pos;
    }
}
