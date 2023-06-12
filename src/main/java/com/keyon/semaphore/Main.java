package com.keyon.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    private Semaphore semaphore = new Semaphore(1);

    public void test() throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + "begin timer = " + System.currentTimeMillis());
        Thread.sleep(5000);
        semaphore.release();
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.test();
    }
}
