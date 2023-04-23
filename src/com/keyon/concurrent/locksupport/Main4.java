package com.keyon.concurrent.locksupport;

import java.util.concurrent.locks.LockSupport;

public class Main4 {

    public static void main(String[] args) {
        Main4 main4 = new Main4();
        main4.test();
    }

    public void test() {
        LockSupport.park(this);
    }

}
