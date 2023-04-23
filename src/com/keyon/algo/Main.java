package com.keyon.algo;

import java.util.*;
public class Main {
    int[] num;
    ArrayList<ArrayList<Integer>> ans;
    LinkedList<Integer> path;
    int n, value, target;
    public ArrayList<ArrayList<Integer>> combinationSum2(int[] num, int target) {
        this.num = num;
        this.target = target;
        ans = new ArrayList<>();
        n = num.length;
        Arrays.sort(num);
        value = 0;
        dfs(0);
        return ans;
    }

    void dfs(int x) {
        if (x == n) {
            if (value == target) {
                ans.add(new ArrayList<>(path));
                return;
            }
            return;
        }
        path.add(num[x]);
        value += num[x];
        dfs(x+1);
        path.removeLast();
        value -= num[x];
        dfs(x+1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] num = {100,10,20,70,60,10,50};
        int target = 80;
        ArrayList<ArrayList<Integer>> ans = main.combinationSum2(num, target);
        for (ArrayList<Integer> list : ans) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}