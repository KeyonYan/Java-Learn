package com.keyon.algo.NingMengWeiQu;

import java.util.PriorityQueue;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = cin.nextInt();
        }
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();
        for (int i = n-1; i >= 0; i--) {
            if (queue1.isEmpty()) {
                queue1.offer(h[i]);
                continue;
            }
            while (queue1.peek() <= h[i]) {
                int v = queue1.poll();
                if (queue1.isEmpty()) {
                    break;
                }
            }
        }
    }
}
