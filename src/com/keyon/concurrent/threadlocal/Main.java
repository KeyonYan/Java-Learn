package com.keyon.concurrent.threadlocal;

public class Main {
    static ThreadLocal<String> localVariable = new ThreadLocal<>();

    static void print(String str) {
        System.out.println(str + ":" + localVariable.get());
//        localVariable.remove();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            localVariable.set("Thread 1 local variable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print("Thread 1");
            System.out.println("Thread 1 remove after:" + localVariable.get());
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            localVariable.set("Thread 2 local variable");
            print("Thread 2");
            System.out.println("Thread 2 remove after:" + localVariable.get());
        });

        t1.start();
        t2.start();

    }
}
