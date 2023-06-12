package com.keyon.design.builder;

public abstract class Builder<T> {

    abstract Builder reset();
    abstract Builder setSeats(int seats);
    abstract Builder setEngine(String engine);
    abstract Builder setGPS(String gps);
    abstract T build();

}
