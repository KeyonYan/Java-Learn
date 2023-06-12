package com.keyon.algo.LeetCodeWeek349.T3;

public class Main {
    public long minCost(int[] nums, int x) {
        int n = nums.length;
        long[] sum = new long[n];
        for (int i = 0; i < n; i++) {
            sum[i] = (long) i * x;
        }
        for (int i = 0; i < n; i++) {
            int cost = nums[i]; // 第i个巧克力的费用
            for (int j = i; j < n + i; j++) {
                cost = Math.min(cost, nums[j % n]); // 第i个巧克力操作j-i次后的最小费用
                sum[j-i] += cost; // 操作j-i次的最小费用
            }
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, sum[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.minCost(new int[]{733,200,839,515,852,615,8,584,250,337}, 537));
        System.out.println(main.minCost(new int[]{20,1,15}, 5));
        System.out.println(main.minCost(new int[]{1,2,3}, 4));
    }
}
