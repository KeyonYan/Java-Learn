package com.keyon.algo.Xiaohongshu.T2;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt(); // query time
        for (int i = 0; i < t; i++) {
            System.out.println(solution(cin));
        }
    }

    private static int solution(Scanner cin) {
        int n = cin.nextInt(); // arr length
        int k = cin.nextInt();
        int[] arr = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
            pq.offer(arr[i]);
        }
        int diffCount = 0;
        for (int i = 0; i < n; i++) {
            if (pq.poll() != arr[i]) {
                diffCount++;
            }
        }
        int ans = 0;
        if (diffCount % k != 0) {
            ans = diffCount/k+1;
        } else {
            ans = diffCount/k;
        }
        return ans;
    }
}
