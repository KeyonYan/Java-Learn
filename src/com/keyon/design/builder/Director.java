package com.keyon.design.builder;

public class Director {

    public Car makeSuv() {
        Builder<Car> builder = new CarBuilder();
        builder.reset()
                .setSeats(4)
                .setEngine("V8")
                .setGPS("GPS");
        return builder.build();
    }

    public Car makeSportsCar() {
        Builder<Car> builder = new CarBuilder();
        builder.reset()
                .setSeats(2)
                .setEngine("V6")
                .setGPS("GPS");
        return builder.build();
    }

}
