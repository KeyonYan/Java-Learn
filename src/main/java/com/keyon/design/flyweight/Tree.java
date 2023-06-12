package com.keyon.design.flyweight;

import lombok.AllArgsConstructor;

/**
 * 情景对象
 */
@AllArgsConstructor
public class Tree {

    int x;
    int y;
    TreeType treeType;

    public void draw() {
        treeType.draw(x, y);
    }
}
