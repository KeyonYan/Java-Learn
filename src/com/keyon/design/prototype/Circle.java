package com.keyon.design.prototype;

public class Circle extends Shape {

    int radius;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        return circle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}