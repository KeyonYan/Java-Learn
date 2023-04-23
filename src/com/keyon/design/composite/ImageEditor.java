package com.keyon.design.composite;

import java.util.ArrayList;

public class ImageEditor {

    CompoundGraphic all;

    public ImageEditor() {
        this.all = new CompoundGraphic();
    }

    public void loadOneGraphic(Graphic g) {
        all.add(g);
    }

    /**
     * 将所需组件组合为复杂的组合组件。
     * @param graphicArr
     */
    public void groupSelected(Graphic... graphicArr) {
        CompoundGraphic group = new CompoundGraphic();
        group.add(graphicArr);
        all.remove(graphicArr);
        all.add(group);
    }

    public void draw() {
        all.draw();
    }
}
