package com.keyon.design.factory.factorymethod;

public class Ship extends Transport {

    private String name; // 船名

    public Ship(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Ship " + name + " is starting!");
    }

    @Override
    public void stop() {
        System.out.println("Ship " + name + " stopped!");
    }
}
