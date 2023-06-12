package com.keyon.design.singleton.singleton3;

/**
 * 静态内部类实现单例
 */
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }

    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

}
