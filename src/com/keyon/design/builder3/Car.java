package com.keyon.design.builder3;

public class Car {

    int seats;
    String engine;
    String gps;

    public Car(final int seats, final String engine, final String gps) {
        this.seats = seats;
        this.engine = engine;
        this.gps = gps;
    }

    public static Car.CarBuilder builder() {
        return new Car.CarBuilder();
    }

    public static class CarBuilder {
        int seats;
        String engine;
        String gps;

        public CarBuilder() {}

        public CarBuilder seats(final int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder engine(final String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder gps(final String gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(seats, engine, gps);
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
