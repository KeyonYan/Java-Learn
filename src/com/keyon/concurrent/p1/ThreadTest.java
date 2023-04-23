package com.keyon.concurrent.p1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadTest {

    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Run Thread 1");
        }
    }

    public static class RunnableTask implements Runnable {

        @Override
        public void run() {
            System.out.println("Run Thread 2");
        }
    }

    public static class CallerTask implements Callable<String> {

        @Override
        public String call() throws Exception {
            System.out.println("Run Thread 3");
            Thread.sleep(1000);
            return "Thread 3: Hello";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // extends Thread
        Thread t1 = new MyThread();
        t1.run();

        // implement Runnable
        RunnableTask rt1 = new RunnableTask();
        new Thread(rt1).start();

        // implement Callable, using FutureTask wrap
        Callable<String> callable = new CallerTask();
        FutureTask<String> futureTask = new FutureTask<>(new CallerTask());
        new Thread(futureTask).start();
        String result = futureTask.get(); // 阻塞直到子线程结束，获取返回值
        System.out.println(result);

        // implement Runnable by anonymous inner class
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Run Thread 4");
            }
        });
        t4.start();

        // implement Runnable by lambda
        Thread t5 = new Thread(() -> {
            System.out.println("Run Thread 5");
        });
        t5.start();


    }

}
