package com.keyon.design.factory.abstractFactory2.factory;

import com.keyon.design.factory.abstractFactory2.entity.Chair;
import com.keyon.design.factory.abstractFactory2.entity.Table;

public interface FurnitureFactory {

    Chair createChair();

    Table createTable();
}
