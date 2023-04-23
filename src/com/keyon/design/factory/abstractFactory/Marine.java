package com.keyon.design.factory.abstractFactory;

public class Marine extends Unit {

    public Marine(int x, int y) {
        super(6, 5  , 40, x, y);
    }

    @Override
    public void show() {
        System.out.println("Marine show in (" + x + ", " + y + ")");
    }

    @Override
    public void attack() {
        System.out.println("Marine attack, attack: " + attack);
    }

}
