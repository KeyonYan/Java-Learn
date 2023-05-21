package com.keyon.design.observer3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationEventBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AccountCreatedListener.class);
        context.refresh();
        context.publishEvent(new AccountCreatedEvent("a account created"));
        context.close();
    }
}
