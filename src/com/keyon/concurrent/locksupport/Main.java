package com.keyon.concurrent.locksupport;

import java.util.concurrent.locks.LockSupport;

public class Main {

    public static void main(String[] args) {
        System.out.println("1");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park(); // hang up
        System.out.println("2");
    }

}
