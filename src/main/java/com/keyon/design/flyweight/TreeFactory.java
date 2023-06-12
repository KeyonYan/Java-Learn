package com.keyon.design.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 享元工厂，复用享元对象
 */
public class TreeFactory {

    private static List<TreeType> treeTypes = new ArrayList<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        return treeTypes.stream()
                .filter(treeType -> treeType.name.equals(name) &&
                        treeType.color.equals(color) &&
                        treeType.texture.equals(texture))
                .findFirst()
                .orElseGet(() -> {
                    TreeType treeType = new TreeType(name, color, texture);
                    treeTypes.add(treeType);
                    System.out.println("TreeFactory: creating new tree type: " + treeType);
                    return treeType;
                });
    }

}
