package com.keyon.concurrent.aqs;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition(); // 条件变量
        new Thread(() -> {
            System.out.println("Thread1: before lock");
            lock.lock(); // 获取锁
            try {
                System.out.println("before await");
                condition.await(); // 阻塞当前线程并释放锁
                System.out.println("after await");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock(); // 释放锁
                System.out.println("Thread1: after unlock");
            }
        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread2: before lock");
            lock.lock();
            try {
                System.out.println("before signal");
                condition.signal(); // 唤醒一个等待线程
                System.out.println("after signal");
            } finally {
                lock.unlock();
                System.out.println("Thread2: after unlock");
            }
        }).start();
    }

}
