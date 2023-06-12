package com.keyon.threadpool;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main2 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3,3,0, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
        for (int i = 0; i < 3; i++) {
            threadPoolExecutor.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            });
        }
        System.out.println(threadPoolExecutor.getTaskCount()); // 线程池需要执行的任务数量
        System.out.println(threadPoolExecutor.getCompletedTaskCount()); // 线程池在运行过程中已完成的任务数量
        System.out.println(threadPoolExecutor.getActiveCount()); // 线程池中正在执行任务的线程数量
        System.out.println(threadPoolExecutor.getPoolSize()); // 线程池中当前线程的数量
        System.out.println(threadPoolExecutor.getLargestPoolSize()); // 线程池中曾经创建过的最大线程数量


    }
}
