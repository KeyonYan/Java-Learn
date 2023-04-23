package com.keyon.design.factory.abstractFactory;

public class Tank extends Unit {

    public Tank(int x, int y) {
        super(10, 10, 40, x, y);
    }

    @Override
    public void show() {
        System.out.println("Tank show in (" + x + ", " + y + ")");
    }

    @Override
    public void attack() {
        System.out.println("Tank attack, attack: " + attack);
    }
}
