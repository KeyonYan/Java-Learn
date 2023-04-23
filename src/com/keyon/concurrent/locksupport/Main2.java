package com.keyon.concurrent.locksupport;

import java.util.concurrent.locks.LockSupport;

public class Main2 {

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("child thread begin park!");
            LockSupport.park();
            System.out.println("child thread unpark!");
        });
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread begin unpark!");
        LockSupport.unpark(t);
    }
}
