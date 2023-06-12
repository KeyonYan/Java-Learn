package com.keyon.algo.LeetCodeWeek347.T2;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        if (n == 1 && m == 1) return ans;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int left = getLeftValue(grid, i-1, j-1);
                int right = getRightValue(grid, n, m, i+1, j+1);
                if (i == 1 && j == 1) {
                }
                ans[i][j] = Math.abs(left - right);
            }
        }
        return ans;
    }

    private int getLeftValue(int[][] grid, int i, int j) {
        if (i == -1 || j == -1) return 0;
        Set<Integer> set = new HashSet<>();
        while (i >= 0 && j >= 0) {
            set.add(grid[i][j]);
            i--;
            j--;
        }
        return set.size();
    }

    private int getRightValue(int[][] grid, int n, int m, int i, int j) {
        if (i == n || j == m) return 0;
        Set<Integer> set = new HashSet<>();
        while (i < n && j < m) {
            set.add(grid[i][j]);
            i++;
            j++;
        }
        return set.size();
    }
}
