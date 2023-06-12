package com.keyon.design.builder2;

public class Car {

    int seats;
    String engine;
    String gps;

    public static Car.CarBuilder builder() {
        return new Car.CarBuilder();
    }

    public static class CarBuilder {
        Car car;

        public CarBuilder() {
            this.car = new Car();
        }

        public CarBuilder reset() {
            car = new Car();
            return this;
        }

        public CarBuilder setSeats(int seats) {
            car.seats = seats;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            car.engine = engine;
            return this;
        }

        public CarBuilder setGPS(String gps) {
            car.gps = gps;
            return this;
        }

        public Car build() {
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
