package com.keyon.design.factory.abstractFactory2.entity;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("Modern chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Modern chair can sit on");
    }
}
