package com.keyon.concurrent.myAQS;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.Condition;

public class ProducterConsumerModel {

    final static NonReentrantLock lock = new NonReentrantLock();
    final static Condition notFull = lock.newCondition();
    final static Condition notEmpty = lock.newCondition();
    final static Queue<String> queue = new LinkedBlockingDeque<>();
    final static int queueSize = 10;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            lock.lock();
            try {
                // 如果队列满了，则等待
                while (queue.size() == queueSize) {
                    notEmpty.await(); // 等待队列不满
                }
                // 添加元素到队列
                queue.offer("ele");
                // 唤醒消费线程
                notFull.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread consumer = new Thread(() -> {
            lock.lock();
            try {
                // 如果队列空了，则等待
                while (0 == queue.size()) {
                    notFull.await(); // 等待队列不空
                }
                // 消费一个产品
                String product = queue.poll();
                System.out.println("Consumer: " + product);
                // 唤醒生产线程
                notEmpty.signalAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        producer.start();
        consumer.start();
    }
}
