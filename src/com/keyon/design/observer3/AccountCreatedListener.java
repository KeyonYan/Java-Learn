package com.keyon.design.observer3;

import org.springframework.context.ApplicationListener;

public class AccountCreatedListener implements ApplicationListener<AccountCreatedEvent> {

    @Override
    public void onApplicationEvent(AccountCreatedEvent accountCreatedEvent) {
        System.out.println("AccountListener receive event: " + accountCreatedEvent);
    }
}
