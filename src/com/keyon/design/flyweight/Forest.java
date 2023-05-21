package com.keyon.design.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class Forest {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        trees.forEach(Tree::draw);
    }

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(1, 2, "name1", "color1", "texture1");
        forest.plantTree(2, 3, "name2", "color2", "texture2");
        forest.plantTree(3, 4, "name3", "color3", "texture3");
        forest.plantTree(5, 6, "name3", "color3", "texture3");
        forest.draw();
    }

}
