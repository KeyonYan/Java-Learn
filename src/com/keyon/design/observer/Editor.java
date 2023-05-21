package com.keyon.design.observer;

/**
 * 具体发布者
 */
public class Editor {
    EventManager eventManager;

    public Editor() {
        this.eventManager = new EventManager();
    }

    public void openFile() {
        eventManager.notify(EventType.OPEN, "Open File");
    }

    public void saveFile() {
        eventManager.notify(EventType.SAVE, "Save File");
    }

    public void closeFile() {
        eventManager.notify(EventType.CLOSE, "Close File");
    }
}
