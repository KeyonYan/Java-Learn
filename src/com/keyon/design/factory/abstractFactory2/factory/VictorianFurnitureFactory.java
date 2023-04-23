package com.keyon.design.factory.abstractFactory2.factory;

import com.keyon.design.factory.abstractFactory2.entity.Chair;
import com.keyon.design.factory.abstractFactory2.entity.Table;
import com.keyon.design.factory.abstractFactory2.entity.VictorianChair;
import com.keyon.design.factory.abstractFactory2.entity.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
