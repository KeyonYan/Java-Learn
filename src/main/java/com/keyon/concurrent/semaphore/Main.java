package com.keyon.concurrent.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

public class Main {
    private static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " over");
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + " over");
                semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        try {
            semaphore.acquire(2); // 阻塞直到semaphore的计数器为2
            System.out.println("all child thread over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
