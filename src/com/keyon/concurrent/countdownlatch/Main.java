package com.keyon.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Main {
    private static volatile CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread1");
            countDownLatch.countDown();
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread2");
            countDownLatch.countDown();
        });
        thread1.start();
        thread2.start();
        try {
            System.out.println("main wait all child thread over");
            countDownLatch.await();
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
