package com.keyon.design.observer;

public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor();
        EventListener logger = new LoggingListener("log.txt");
        editor.eventManager.subscribe(EventType.OPEN, logger);
        editor.eventManager.subscribe(EventType.CLOSE, logger);
        EventListener emailAlerts = new EmailAlertsListener("abc@com");
        editor.eventManager.subscribe(EventType.SAVE, emailAlerts);

        editor.openFile();
        editor.saveFile();
        editor.closeFile();
    }
}
