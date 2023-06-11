package com.keyon.algo.LeetCodeDWeak106.T3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    static final int MOD = 1000000007;
    public static int sumDistance(int[] nums, String s, int d) {
        for (int i = 0; i < nums.length; i++) {
            if (s.charAt(i) == 'L') {
                nums[i] = nums[i] - d;
            } else {
                nums[i] = nums[i] + d;
            }
        }
        Arrays.sort(nums);
        int ans = 0;
        int sum = 0;
        // x1,x2,x3,x4
        // x2: x2 - x1
        // x3: x3-x1 + x3-x2 = 2*x3-x1-x2;
        for (int i = 0; i < nums.length; i++) {
            ans = ans + i*nums[i] - sum;
            sum += ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sumDistance(new int[]{-2,0,2}, "RLL", 3));
    }
}
