package com.keyon.algo.Baidu;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            queue.offer(in.nextLong());
        }
        int k = 0;
        while(queue.peek()+k >= n) {
            Long max = queue.poll();
            queue.offer(max-n-k);
            k++;
        }
        System.out.println(k);
    }
}