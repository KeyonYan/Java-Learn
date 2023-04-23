package com.keyon.design.decorator;

public abstract class DataSource {
    abstract void writeData(String data);
    abstract String readData();
}
