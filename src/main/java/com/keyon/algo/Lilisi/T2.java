package com.keyon.algo.Lilisi;

import java.util.Arrays;

public class T2 {

    public static void main(String[] args) {
//        long res = new T2().ans(new int[]{1,2,1}, 2);
//        long res = new T2().ans(new int[]{1,2,3}, 5);
//        long res = new T2().ans(new int[]{1,1,2,3}, 4);
        long res = new T2().ans(new int[]{1,1,2,2,3}, 4);
        System.out.println(res);
    }

    public long ans (int[] array, int k) {
        Arrays.sort(array);
        int n = array.length;
        long res = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] + array[j] > k) {
                    break;
                }
                res++;
            }
        }
        return res;
    }
}
