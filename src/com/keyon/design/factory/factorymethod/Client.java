package com.keyon.design.factory.factorymethod;

public class Client {

    public static void main(String[] args) {
        Logistics logistics = new ShipLogistics();
        logistics.planDelivery();
        logistics.startTransport();
    }
}
