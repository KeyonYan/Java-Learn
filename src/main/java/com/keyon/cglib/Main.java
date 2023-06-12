package com.keyon.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Hello.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        Hello proxy = (Hello) enhancer.create();
        proxy.sayHello();
    }

}
