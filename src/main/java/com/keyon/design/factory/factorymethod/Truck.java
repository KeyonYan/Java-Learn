package com.keyon.design.factory.factorymethod;

public class Truck extends Transport {

    private String licensePlate; // 车牌号

    public Truck(int capacity, String licensePlate) {
        super(capacity);
        this.licensePlate = licensePlate;
    }

    @Override
    public void start() {
        System.out.println("Truck " + licensePlate + " is starting!");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + licensePlate + " stopped!");
    }
}
