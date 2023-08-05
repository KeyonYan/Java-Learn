package com.keyon.queue;

import java.util.PriorityQueue;

public class PriorityQueueCreate {
    public static void main(String[] args) {
        // 最小堆
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(5);
        queue.offer(3);
        while (!queue.isEmpty()) System.out.println(queue.poll());
        // 最大堆
        PriorityQueue<Integer> queue2 = new PriorityQueue<>((o1, o2) -> o2 - o1);
        queue2.offer(1);
        queue2.offer(5);
        queue2.offer(3);
        while (!queue2.isEmpty()) System.out.println(queue2.poll());
    }
}
