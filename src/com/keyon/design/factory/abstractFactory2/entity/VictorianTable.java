package com.keyon.design.factory.abstractFactory2.entity;

public class VictorianTable implements Table {

    @Override
    public void hasLegs() {
        System.out.println("Victorian table has 4 legs");
    }

    @Override
    public void putOn() {
        System.out.println("Victorian table can put on");
    }

}
