package com.keyon.design.builder4;

import com.keyon.design.builder4.Car;

public class Client {

    public static void main(String[] args) {
        Car suv = Car.builder()
                .seats(4)
                .engine("V8")
                .gps("GPS")
                .build();
        Car sportsCar = Car.builder()
                .seats(2)
                .engine("V6")
                .gps("GPS")
                .build();

        System.out.println(suv);
        System.out.println(sportsCar);
    }
}
