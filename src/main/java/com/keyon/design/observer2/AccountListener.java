package com.keyon.design.observer2;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 订阅者：账号监听器，处理账号创建成功后的业务逻辑
 */
@Component
public class AccountListener {

    @EventListener(AccountCreatedEvent.class)
    @Async
    public void handleAccountEvent(AccountCreatedEvent event) {
        System.out.println("AccountListener: " + event);
        System.out.println("Send Welcome Email");
    }

    @EventListener(AccountCreatedEvent.class)
    @Order(100)
    public void handleAccountEvent2(AccountCreatedEvent event) {
        System.out.println("AccountListener2: " + event);
        System.out.println("Add Points");
    }

    @EventListener(AccountCreatedEvent.class)
    @Order(200)
    public void handleAccountEvent3(AccountCreatedEvent event) {
        System.out.println("AccountListener3: " + event);
        System.out.println("Add Coupon");
    }

    @EventListener(AccountCreatedEvent.class)
    @Async
    public void handleAccountEvent4(AccountCreatedEvent event) {
        System.out.println("AccountListener4: " + event);
        System.out.println("Create Index");
    }

    @EventListener(AccountLoginEvent.class)
    public void handleAccountLoginEvent(AccountLoginEvent event) {
        System.out.println("AccountLoginListener: " + event);
        System.out.println("Welcome Login");
    }
}
