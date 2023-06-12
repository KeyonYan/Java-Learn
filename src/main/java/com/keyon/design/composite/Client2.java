package com.keyon.design.composite;

public class Client2 {

    public static void main(String[] args) {
        ImageEditor imageEditor = new ImageEditor();
        CompoundGraphic cg = CompoundGraphic.builder()
                .add(new Dot(1, 2))
                .add(new Circle(1, 2, 3))
                .add(new Circle(1, 2, 4))
                .build();
        Graphic dot2 = new Dot(3, 4);
        imageEditor.loadOneGraphic(cg);
        imageEditor.loadOneGraphic(dot2);
        imageEditor.groupSelected(cg, dot2);
        imageEditor.draw();
    }
}
