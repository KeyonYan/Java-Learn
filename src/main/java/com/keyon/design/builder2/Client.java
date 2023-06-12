package com.keyon.design.builder2;

public class Client {

    public static void main(String[] args) {
        Car suv = new Car.CarBuilder()
                .reset()
                .setSeats(4)
                .setEngine("V8")
                .setGPS("GPS")
                .build();
        Car sportsCar = new Car.CarBuilder()
                .reset()
                .setSeats(2)
                .setEngine("V6")
                .setGPS("GPS")
                .build();

        System.out.println(suv);
        System.out.println(sportsCar);
    }
}
