package com.keyon.algo.Tencent;

import java.util.Arrays;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        Arrays.sort(nums);
        int res = nums[n-1];
        int l = 0;
        int r = n-2;
        while (l < r) {
            res += nums[r] - nums[l];
            l++;
            r--;
        }
        System.out.println(res);
    }
}
