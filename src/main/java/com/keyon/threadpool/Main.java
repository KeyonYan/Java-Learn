package com.keyon.threadpool;

import java.util.concurrent.*;

public class Main {
    static volatile int a = 0;
    static volatile int b = 0;
    public static void main(String[] args) {
        // newCachedThreadPool
        Executor executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        // newFixedThreadPool
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(() -> {
//                System.out.println(Thread.currentThread().getName());
//            });
//        }
        // newScheduledThreadPool
        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(3);
        // 定时任务
//        for (int i = 0; i < 10; i++) {
//            executorService1.schedule(() -> {
//                System.out.println(Thread.currentThread().getName());
//            }, 1, TimeUnit.SECONDS); // 延迟1s执行
//        }
        // 周期任务
        executorService1.scheduleAtFixedRate(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a++;
            System.out.println(Thread.currentThread().getName() + ": " + a);
        }, 1, 2, TimeUnit.SECONDS); // 延迟1s执行，上一次任务开始后等2s执行下一个任务
        ScheduledExecutorService executorService2 = Executors.newScheduledThreadPool(3);
        executorService2.scheduleWithFixedDelay(() -> {
try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b++;
            System.out.println(Thread.currentThread().getName() + ": " + b);
        }, 1, 2, TimeUnit.SECONDS); // 延迟1s执行，上一次任务结束后等2s执行下一个任务
        // newSingleThreadExecutor
        ExecutorService executorService3 = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            executorService3.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        // newWorkStealingPool
    }
}
