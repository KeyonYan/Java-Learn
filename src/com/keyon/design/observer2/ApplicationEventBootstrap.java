package com.keyon.design.observer2;

import com.keyon.design.observer2.AccountListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationEventBootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AccountListener.class);
        context.refresh();
        context.publishEvent(new AccountCreatedEvent("a account created"));
        context.publishEvent(new AccountLoginEvent("a account login"));
        context.close();
    }
}
