package com.keyon.reflect;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 通过类的全路径名获取Class对象
        Class clazz = Class.forName("java.lang.String");
        // 2. 通过类名.class获取Class对象
        Class clazz2 = String.class;
        // 3. 通过对象的getClass()方法获取Class对象
        String str = "hello";
        Class clazz3 = str.getClass();
        // 4. 通过类加载器获取Class对象
        ClassLoader classLoader = String.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("java.lang.String");
        // 5. 基本数据类型的包装类都有一个TYPE属性
        Class clazz5 = Integer.TYPE;
        // 6. void关键字也有一个TYPE属性
        Class clazz6 = Void.TYPE;
        // 7. 通过数组的getClass()方法获取Class对象
        int[] arr = new int[10];
        Class clazz7 = arr.getClass();
        // 8. 通过多维数组的getClass()方法获取Class对象
        int[][] arr2 = new int[10][10];
        Class clazz8 = arr2.getClass();
        // 9. 通过Class对象的getComponentType()方法获取数组的元素类型
        Class clazz9 = clazz8.getComponentType();
        // 10. 通过Class对象的getSuperclass()方法获取父类的Class对象
        Class clazz10 = clazz.getSuperclass();
        // 11. 通过Class对象的getInterfaces()方法获取接口的Class对象
        Class[] clazz11 = clazz.getInterfaces();
        // 12. 通过Class对象的getDeclaredClasses()方法获取内部类的Class对象
        Class[] clazz12 = clazz.getDeclaredClasses();
        // 13. 通过Class对象的getDeclaringClass()方法获取内部类所在的外部类的Class对象
        Class clazz13 = clazz12[0].getDeclaringClass();
        // 14. 通过Class对象的getPackage()方法获取包的Package对象
        Package pack = clazz.getPackage();
        // 15. 通过Class对象的getModifiers()方法获取修饰符
        int modifiers = clazz.getModifiers();
        // 16. 通过Class对象的getName()方法获取类的全路径名
        String name = clazz.getName();
        // 17. 通过Class对象的getSimpleName()方法获取类名
        String simpleName = clazz.getSimpleName();
        // 18. 通过Class对象的getCanonicalName()方法获取类的规范名
        String canonicalName = clazz.getCanonicalName();
        // 19. 通过Class对象的getTypeName()方法获取类的类型名
        String typeName = clazz.getTypeName();
        // 20. 通过Class对象的isInterface()方法判断是否是接口
        boolean isInterface = clazz.isInterface();
        // 21. 通过Class对象的isArray()方法判断是否是数组
        boolean isArray = clazz.isArray();
        // 22. 通过Class对象的isPrimitive()方法判断是否是基本数据类型
        boolean isPrimitive = clazz.isPrimitive();
        // 23. 通过Class对象的isAnnotation()方法判断是否是注解
        boolean isAnnotation = clazz.isAnnotation();
        // 24. 通过Class对象的isEnum()方法判断是否是枚举
        boolean isEnum = clazz.isEnum();
        // 25. 通过Class对象的isAnonymousClass()方法判断是否是匿名内部类
        boolean isAnonymousClass = clazz.isAnonymousClass();
        // 26. 通过Class对象的isLocalClass()方法判断是否是局部内部类
        boolean isLocalClass = clazz.isLocalClass();
        // 27. 通过Class对象的isMemberClass()方法判断是否是成员内部类
        boolean isMemberClass = clazz.isMemberClass();
        // 28. 通过Class对象的isSynthetic()方法判断是否是合成类
        boolean isSynthetic = clazz.isSynthetic();
        // 29. 通过Class对象的isInstance()方法判断是否是某个类的实例
        boolean isInstance = clazz.isInstance(str);
        // 30. 通过Class对象的isAssignableFrom()方法判断是否是某个类的子类
        boolean isAssignableFrom = clazz.isAssignableFrom(clazz2);
        // 31. 通过Class对象的asSubclass()方法将Class对象转换为某个类的子类
        Class clazz14 = clazz.asSubclass(clazz2);
        // 32. 通过Class对象的cast()方法将对象转换为某个类的实例
        String str2 = (String) clazz.cast(str);
    }
}
