package com.keyon.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main2 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clz = Apple.class;
        Method setPriceMethod = clz.getMethod("setPrice", int.class);
        Constructor constructor = clz.getConstructor();
        constructor.setAccessible(true);
        Object appleObj = constructor.newInstance();
        setPriceMethod.invoke(appleObj, 14);
        Method getPriceMethod = clz.getMethod("getPrice");
        Object price = getPriceMethod.invoke(appleObj);
        System.out.println(price); // 14
        System.out.println(clz.getName()); // com.keyon.reflect.Apple
        System.out.println(clz.getSimpleName()); // Apple
        System.out.println(clz.getPackage()); // package com.keyon.reflect
        System.out.println(clz.getSuperclass()); // class java.lang.Object

    }
}
