package com.keyon.concurrent.p2;

public class ObjTest4 {
    static Object obj = new Object();
    static int i = 0;
    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            synchronized (obj) {
                while (i < 100) {
                    System.out.println("A: " + i++);
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });
        Thread B = new Thread(() -> {
            synchronized (obj) {
                while (i < 100) {
                    System.out.println("B: " + i++);
                    obj.notify();
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                obj.notify();
            }
        });
        A.start();
        B.start();
    }
}
