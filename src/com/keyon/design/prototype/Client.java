package com.keyon.design.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();
        circle.x = 1;
        circle.y = 2;
        circle.radius = 3;
        circle.color = "red";

        Shape circle2 = (Shape) circle.clone();
        System.out.println(circle2);
        System.out.println(circle == circle2);

        Rectangle rectangle = new Rectangle();
        rectangle.x = 4;
        rectangle.y = 6;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "blue";

        Shape rectangle2 = (Shape) rectangle.clone();
        System.out.println(rectangle2);
        System.out.println(rectangle == rectangle2);
    }
}
