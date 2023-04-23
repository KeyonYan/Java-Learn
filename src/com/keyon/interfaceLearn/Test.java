package com.keyon.interfaceLearn;

public interface Test {

    default void test() {
        System.out.println("test");
    }

}
