package com.keyon.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] arr = new int[][] {{5, 1}, {3, 2}, {2, 3}, {1, 4}, {4, 5}};
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}
