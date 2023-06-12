package com.keyon.proxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Hello hello = new HelloImpl();
        InvocationHandler handler = new InvocationHandler(hello);
        Hello proxy = (Hello) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), handler);
        proxy.sayHello();
        proxy.sayBye();
    }

}
