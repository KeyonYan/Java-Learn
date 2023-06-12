package com.keyon.design.factory.abstractFactory2;

import com.keyon.design.factory.abstractFactory2.entity.Chair;
import com.keyon.design.factory.abstractFactory2.entity.Table;
import com.keyon.design.factory.abstractFactory2.factory.FurnitureFactory;
import com.keyon.design.factory.abstractFactory2.factory.ModernFurnitureFactory;

public class Client {

    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();
        chair.hasLegs();
        chair.sitOn();
        table.hasLegs();
        table.putOn();
    }
}
