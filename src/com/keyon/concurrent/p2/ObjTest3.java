package com.keyon.concurrent.p2;

public class ObjTest3 {

    static Object obj = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("begin");
            synchronized (obj) {
                try {
                    obj.wait(1000, 999998);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("over");
        });

        t1.start();
    }
}
