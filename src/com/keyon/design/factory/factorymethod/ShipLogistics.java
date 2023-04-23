package com.keyon.design.factory.factorymethod;

public class ShipLogistics extends Logistics {

    @Override
    Transport createTransport() {
        return new Ship(60, "海螺号");
    }
}
