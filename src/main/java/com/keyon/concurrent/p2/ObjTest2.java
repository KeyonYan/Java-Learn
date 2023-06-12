package com.keyon.concurrent.p2;

public class ObjTest2 {
    static Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("begin");
            synchronized (obj) {
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("over");
        });

        t1.start();
        Thread.sleep(1000);
        System.out.println("interrupt start");
        t1.interrupt();
        System.out.println("interrupt end");
    }
}
