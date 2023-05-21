package com.keyon.design.observer2;

import org.springframework.context.ApplicationEvent;

public class AccountLoginEvent extends ApplicationEvent {

    public AccountLoginEvent(Object source) {
        super(source);
    }
}
