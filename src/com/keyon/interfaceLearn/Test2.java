package com.keyon.interfaceLearn;

public interface Test2 extends Test {
    int a = 1;
    public static final int b = 1; // 隐式指定了public static final，不能为private, protected
    @Override
    default void test() {
        System.out.println("test2");
    }
}
