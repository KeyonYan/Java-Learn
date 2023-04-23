package com.keyon.design.factory.abstractFactory;

public class HumanFactory implements AbstractFactory {

    private int x;
    private int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Unit createLowUnit() {
        Unit unit = new Marine(x, y);
        System.out.println("Create Marine Success");
        return unit;
    }

    @Override
    public Unit createMidUnit() {
        Unit unit = new Tank(x, y);
        System.out.println("Create Tank Success");
        return unit;
    }

    @Override
    public Unit createHighUnit() {
        Unit unit = new Battleship(x, y);
        System.out.println("Create Battleship Success");
        return unit;
    }
}
