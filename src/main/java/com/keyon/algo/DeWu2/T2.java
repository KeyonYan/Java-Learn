package com.keyon.algo.DeWu2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        int res = 0;
        int cnt = 0;
        int bufferNum = 0;
        int bufferCnt = 0;
        boolean flag = true;
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                res += arr[i];
                cnt++;
            } else {
                if (flag) {
                    flag = false;
                    bufferCnt = cnt % 3;
                }
                bufferNum += arr[i];
                bufferCnt++;
            }
            if ((bufferCnt / 3) * k >= -bufferNum) {
                res += bufferNum;
                cnt += bufferCnt;
                bufferNum = 0;
                bufferCnt = 0;
            }
        }

        System.out.println(res + (cnt / 3) * k);
    }
}
