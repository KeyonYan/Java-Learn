package com.keyon.interfaceLearn;

public class AbstractTest2 extends AbstractTest implements Test2{
    @Override
    void printTest() {
        System.out.println("printTest");
    }

    @Override
    public void test() {
        Test2.super.test();
    }

    public static void main(String[] args) {
        AbstractTest2 abstractTest2 = new AbstractTest2();
        abstractTest2.printTest();
        abstractTest2.printTest2();
        abstractTest2.test();
        System.out.println(Test2.a);
        System.out.println(AbstractTest2.a);
    }
}
