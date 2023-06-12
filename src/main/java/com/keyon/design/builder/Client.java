package com.keyon.design.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Car suv = director.makeSuv();
        Car sportsCar = director.makeSportsCar();

        System.out.println(suv);
        System.out.println(sportsCar);
    }
}
