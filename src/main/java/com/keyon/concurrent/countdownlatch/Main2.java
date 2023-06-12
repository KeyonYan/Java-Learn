package com.keyon.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        try {
            System.out.println("main wait all child thread over");
            countDownLatch.await();
            System.out.println("main");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
