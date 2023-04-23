package com.keyon.design.factory.abstractFactory2.entity;

public class ModernTable implements Table {

    @Override
    public void hasLegs() {
        System.out.println("Modern table has 4 legs");
    }

    @Override
    public void putOn() {
        System.out.println("Modern table can put on");
    }

}
