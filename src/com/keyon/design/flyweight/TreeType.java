package com.keyon.design.flyweight;

import lombok.AllArgsConstructor;

/**
 * 享元对象
 */
@AllArgsConstructor
public class TreeType {

    String name;
    String color;
    String texture;

    public void draw(int x, int y) {
        System.out.println("TreeType: draw() x = " + x + ", y = " + y);
    }
}
