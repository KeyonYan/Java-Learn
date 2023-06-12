package com.keyon.design.singleton.singleton1;

/**
 * 饿汉式单例
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

}
