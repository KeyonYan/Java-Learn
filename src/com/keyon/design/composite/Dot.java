package com.keyon.design.composite;

public class Dot extends Graphic {
    int x;
    int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    void draw() {
        System.out.println("Draw a dot in (" + x + "," + y + ")");
    }
}
