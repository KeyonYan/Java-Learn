package com.keyon.interfaceLearn;

public class Test3 implements Test2{
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
        System.out.println(Test2.a);
        System.out.println(Test3.a);
    }
}
