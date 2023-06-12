package com.keyon.design.builder;

public class CarBuilder extends Builder<Car> {

    Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    @Override
    public Builder reset() {
        car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int seats) {
        car.seats = seats;
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        car.engine = engine;
        return this;
    }

    @Override
    public Builder setGPS(String gps) {
        car.gps = gps;
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
