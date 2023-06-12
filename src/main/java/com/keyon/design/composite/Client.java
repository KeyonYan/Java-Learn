package com.keyon.design.composite;

public class Client {

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        Graphic dot = new Dot(1, 2);
        Graphic circle1 = new Circle(1, 2, 3);
        Graphic circle2 = new Circle(1, 2, 4);
        Graphic dot2 = new Dot(3, 4);
        CompoundGraphic cg = new CompoundGraphic();
        cg.add(dot, circle1, circle2);
        imageEditor.loadOneGraphic(cg);
        imageEditor.loadOneGraphic(dot2);
        imageEditor.groupSelected(cg, dot2);
        imageEditor.draw();
    }
}
