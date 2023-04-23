package com.keyon.design.prototype;

public class Rectangle extends Shape {

    int width;
    int height;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Rectangle rectangle = (Rectangle) super.clone();
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
