package com.keyon.design.factory.abstractFactory;

public class Battleship extends Unit {

    public Battleship(int x, int y) {
        super(25, 200, 500, x, y);
    }

    @Override
    public void show() {
        System.out.println("Battleship show in (" + x + "," + y + ")");
    }

    @Override
    public void attack() {
        System.out.println("Battleship attack, attack: " + attack);
    }
}
