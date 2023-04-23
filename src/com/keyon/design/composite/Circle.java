package com.keyon.design.composite;

public class Circle extends Dot {
    int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle in (" + x + "," + y + "), radius is " + radius);
    }
}
