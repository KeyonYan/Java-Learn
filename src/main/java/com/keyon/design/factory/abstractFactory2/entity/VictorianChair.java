package com.keyon.design.factory.abstractFactory2.entity;

public class VictorianChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Victorian chair can sit on");
    }
}
