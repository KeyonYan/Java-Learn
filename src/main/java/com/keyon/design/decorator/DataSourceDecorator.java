package com.keyon.design.decorator;

public class DataSourceDecorator extends DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    String readData() {
        return wrappee.readData();
    }
}
