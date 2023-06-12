package com.keyon.algo.Xiaohongshu.T3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(); // 数组长度   1 2 3 4
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int m = cin.nextInt(); // 操作次数
        int[] arrL = new int[m]; // M次操作的区间左端点  1 2
        int[] arrR = new int[m]; // M次操作的区间右端点  4 3
        for (int i = 0; i < m; i++) {
            arrL[i] = cin.nextInt() - 1;
        }
        for (int i = 0; i < m; i++) {
            arrR[i] = cin.nextInt() - 1;
        }
        String opStr = cin.next(); // 操作字符串  =|&=|
        int[] argX = new int[m]; // M次操作的参数X  1 2 1 2
        for (int i = 0; i < m; i++) {
            argX[i] = cin.nextInt();
        }
        // solution
        for (int i = 0; i < m; i++) {
            for (int j = arrL[i]; j <= arrR[i]; j++) {
                if (opStr.charAt(i) == '=') {
                    arr[j] = argX[i];
                } else if (opStr.charAt(i) == '|') {
                    arr[j] |= argX[i];
                } else {
                    arr[j] &= argX[i];
                }
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
