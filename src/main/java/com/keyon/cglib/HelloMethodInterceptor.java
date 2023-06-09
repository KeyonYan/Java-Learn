package com.keyon.cglib;

import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloMethodInterceptor implements org.springframework.cglib.proxy.MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("After");
        return result;
    }
}
