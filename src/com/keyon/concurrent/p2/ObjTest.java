package com.keyon.concurrent.p2;

public class ObjTest {
    private static volatile Object A = new Object();
    private static volatile Object B = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (A) {
                System.out.println("Thread 1 get A lock");
                synchronized (B) {
                    System.out.println("Thread 1 get B lock");
                    try {
                        System.out.println("Thread 1 release A lock");
                        A.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (A) {
                    System.out.println("Thread 2 get A lock");
                    System.out.println("Thread 2 try get B lock");
                    synchronized (B) {
                        System.out.println("Thread 2 get B lock");
                        System.out.println("Thread 2 release B lock");
                        A.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Over");
    }
}
