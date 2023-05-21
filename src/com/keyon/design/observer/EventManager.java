package com.keyon.design.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 发布者基类
 */
public class EventManager {

    Map<EventType, List<EventListener>> listeners;

    public EventManager() {
        this.listeners = new HashMap<>();
        for (EventType e : EventType.values()) {
            listeners.put(e, new ArrayList<>());
        }
    }

    public void subscribe(EventType eventType, EventListener listener) {
        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(EventType eventType, String msg) {
        listeners.get(eventType).forEach(listener -> listener.update(msg));
    }

}
