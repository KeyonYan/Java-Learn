package com.keyon.design.observer3;

import org.springframework.context.ApplicationEvent;

public class AccountCreatedEvent extends ApplicationEvent {

    public AccountCreatedEvent(Object source) {
        super(source);
    }
}
