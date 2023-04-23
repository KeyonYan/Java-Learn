package com.keyon.design.factory.abstractFactory;

/**
 * 兵种抽象类
 */
public abstract class Unit {

    protected int attack; // 攻击力
    protected int defense; // 防御力
    protected int hp; // 血量
    protected int x; // 横坐标
    protected int y; // 纵坐标

    public Unit(int attack, int defense, int hp, int x, int y) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.x = x;
        this.y = y;
    }

    public abstract void show();

    public abstract void attack();
}
