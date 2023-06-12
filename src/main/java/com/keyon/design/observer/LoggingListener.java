package com.keyon.design.observer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListener implements EventListener {
    String log;

    public LoggingListener(String log) {
        this.log = log;
    }

    @Override
    public void update(String msg) {
        System.out.println("LoggingListener: " + msg);
    }
}
