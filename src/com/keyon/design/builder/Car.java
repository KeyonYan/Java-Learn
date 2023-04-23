package com.keyon.design.builder;

public class Car {

    int seats;
    String engine;
    String gps;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
