package com.keyon.design.factory.abstractFactory2.factory;

import com.keyon.design.factory.abstractFactory2.entity.Chair;
import com.keyon.design.factory.abstractFactory2.entity.ModernChair;
import com.keyon.design.factory.abstractFactory2.entity.ModernTable;
import com.keyon.design.factory.abstractFactory2.entity.Table;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
