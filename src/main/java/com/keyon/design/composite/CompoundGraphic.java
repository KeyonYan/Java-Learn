package com.keyon.design.composite;

import java.util.ArrayList;
import java.util.Arrays;

public class CompoundGraphic extends Graphic {
    ArrayList<Graphic> graphicArr;

    public CompoundGraphic() {
        this.graphicArr = new ArrayList<>();
    }

    public void add(Graphic... arr) {
        Arrays.stream(arr).forEach(g -> graphicArr.add(g));
    }

    public void remove(Graphic... arr) {
        Arrays.stream(arr).forEach(g -> graphicArr.remove(g));
    }

    @Override
    void move(int x, int y) {
        graphicArr.forEach(g -> g.move(x, y));
    }

    @Override
    void draw() {
        graphicArr.forEach(g -> g.draw());
    }

    public static CompoundGraphicBuilder builder() {
        return new CompoundGraphicBuilder();
    }

    public static class CompoundGraphicBuilder {
        CompoundGraphic compoundGraphic;

        public CompoundGraphicBuilder() {
            this.compoundGraphic = new CompoundGraphic();
        }

        public CompoundGraphicBuilder add(Graphic g) {
            compoundGraphic.add(g);
            return this;
        }

        public CompoundGraphicBuilder remove(Graphic g) {
            compoundGraphic.remove(g);
            return this;
        }

        public CompoundGraphic build() {
            return compoundGraphic;
        }
    }
}
