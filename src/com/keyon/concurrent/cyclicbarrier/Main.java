package com.keyon.concurrent.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

public class Main {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(2, () -> {
        System.out.println("all child thread over a step");
    });

    public static void main(String[] args) {
        ExecutorService executorService = java.util.concurrent.Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "step3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executorService.submit(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "step1");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "step2");
                cyclicBarrier.await();
                System.out.println(Thread.currentThread().getName() + "step3");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
    }
}
