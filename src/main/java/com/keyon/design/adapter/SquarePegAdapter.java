package com.keyon.design.adapter;

/**
 * 方钉适配器
 */
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    public int getRadius() {
        // 适配器会假扮为一个圆钉，其半径刚好能与适配器实际封装的方钉搭配
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }

}
