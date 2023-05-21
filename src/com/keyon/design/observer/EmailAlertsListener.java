package com.keyon.design.observer;

public class EmailAlertsListener implements EventListener {
    String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String msg) {
        System.out.println("EmailAlertsListener: " + msg);
    }
}
