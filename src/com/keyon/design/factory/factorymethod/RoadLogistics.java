package com.keyon.design.factory.factorymethod;

public class RoadLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Truck(30, "鲁D-CD555");
    }
}
