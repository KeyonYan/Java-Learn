package com.keyon.algo.Lilisi;

public class T3 {
    public static void main(String[] args) {
        // 先求总和  15 / 2 = 7.5
        // 维护一个滑窗                  更新滑窗和
        // 【1 2 3】 4 5 1 2 3 4 5   ==== 6
        // 1 【2 3】4 5 1 2 3 4 5  ==== 6
        // 1 2 【3 4】5 1 2 3 4 5  ==== 7
        // 1 2 3 【4】5 1 2 3 4 5  ==== 7
        // 1 2 3 【4 5】1 2 3 4 5  ==== 7
        // abs(7 - (15-7)) = 1
        // 1 2 3 4 【5】1 2 3 4 5  ==== 6

        int[] nums = {1,2,3,4,5};
//        int[] nums = {7, 5, 3, 6, 4, 2, 1};
        T3 sol = new T3();
        System.out.println(sol.solution(nums));
    }

    public int solution(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }

        int n = nums.length;
        int[] doubleNums = new int[2 * n];
        for (int i = 0; i < n; i++) {
            doubleNums[i] = nums[i];
            doubleNums[i + n] = nums[i];
        }

        int i = 0;
        int j = 0;
        int prefix = 0;
        int m = 0;

        while (i < n) {
            while (j < 2 * n && prefix + doubleNums[j] <= s / 2) {
                prefix += doubleNums[j];
                j++;
            }
            m = Math.max(m, prefix);
            prefix -= doubleNums[i];
            i++;
        }

        return s - 2 * m;
    }

}
