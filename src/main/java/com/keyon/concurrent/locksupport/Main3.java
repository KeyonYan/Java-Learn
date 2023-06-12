package com.keyon.concurrent.locksupport;

import java.util.concurrent.locks.LockSupport;

public class Main3 {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("child thread begin park!");
            while (!Thread.currentThread().isInterrupted()) {
                LockSupport.park();
            }
            System.out.println("child thread unpark!");
        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread begin unpark!");
//        t.interrupt();
        LockSupport.unpark(t);
    }

}
