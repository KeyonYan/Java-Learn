package com.keyon.algo.MeiTuan2.T1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        boolean[] ans = new boolean[t];
        for (int k = 0; k < t; k++) {
            ans[k] = solution(cin);
        }
        for (int k = 0; k < t; k++) {
            if (ans[k]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean solution(Scanner cin) {
        int n = cin.nextInt();
        int[] inArr = new int[n];
        int[] outArr = new int[n];
        for (int i = 0; i < n; i++) {
            inArr[i] = cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            outArr[i] = cin.nextInt();
        }
        // solution
        Deque<Integer> stack = new ArrayDeque<>();
        int i, k = 0;
        for (i = 0; i < n; i++) {
            stack.push(inArr[i]);
            while (stack.peek() == outArr[k]) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                k++;
                if (stack.isEmpty()) {
                    break;
                }
            }
        }
        if (k == n) return true;
        return false;
    }
}
