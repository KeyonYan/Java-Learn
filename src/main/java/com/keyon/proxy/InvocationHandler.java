package com.keyon.proxy;

public class InvocationHandler implements java.lang.reflect.InvocationHandler {

    private Object target;

    public InvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sayBye")) {
            return method.invoke(target, args);
        }
        System.out.println("Before");
        Object result = method.invoke(target, args);
        System.out.println("After");
        return result;
    }

}
