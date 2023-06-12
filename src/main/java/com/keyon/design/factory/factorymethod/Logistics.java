package com.keyon.design.factory.factorymethod;

public abstract class Logistics {

    Transport transport;

    protected void planDelivery() {
        transport = createTransport();
    }

    abstract Transport createTransport();

    public void startTransport() {
        transport.start();
    }

}
