package com.keyon.design.adapter;

/**
 * 圆钉
 */
public class RoundPeg {

    int radius;

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundHole hole) {
        return this.radius <= hole.getRadius();
    }

}
