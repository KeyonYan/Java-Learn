package com.keyon.algo.MeiTuan.M2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        if (n == 1) {
            System.out.println(1);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }
        // solution
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        map.put(arr[left], 1);
        int ans = 0;
        while(right != n) {
            if (map.size() <= k) {
                right++;
                if (map.containsKey(arr[right])) {
                    map.put(arr[right], map.get(arr[right]) + 1);
                } else {
                    map.put(arr[right], 1);
                }
            } else {
                int leftV = map.get(arr[left]);
                if (leftV == 1) {
                    map.remove(arr[left]);
                } else {
                    map.put(arr[left], leftV - 1);
                }
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        System.out.println(ans);
    }
}
