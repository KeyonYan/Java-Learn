package com.keyon.concurrent.unsafetest;


//import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Main {

//    static final Unsafe unsafe;
//    static final long stateOffset;
//    private volatile long state = 0;
//
//    static {
//        try {
//            Field field = Unsafe.class.getDeclaredField("theUnsafe");
//            field.setAccessible(true);
//            unsafe = (Unsafe) field.get(null);
//            stateOffset = unsafe.objectFieldOffset(Main.class.getDeclaredField("state"));
//        } catch (Exception e) {
//            throw new Error(e);
//        }
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        boolean success = unsafe.compareAndSwapInt(main, stateOffset, 0, 1);
//        System.out.println(success);
//    }

}
