package com.keyon.design.factory.factorymethod;

public abstract class Transport {

    public int capacity;

    public int weight;

    public Transport(int capacity) {
        this.capacity = capacity;
        this.weight = 0;
    }

    public void load(int amount) {
        weight += amount;
    }

    public void unload(int amount) {
        weight -= amount;
    }

    public boolean isOverload() {
        return weight > capacity;
    }

    public abstract void start();

    public abstract void stop();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
