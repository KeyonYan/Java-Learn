package com.keyon.proxy;

public class HelloImpl implements Hello {

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
    @Override
    public void sayBye() {
        System.out.println("Bye Bye!");
    }
}
