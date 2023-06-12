package com.keyon.design.decorator;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    void writeData(String data) {
        System.out.println("Compress data: " + data);
        super.writeData(data);
    }

    @Override
    String readData() {
        String data = super.readData();
        System.out.println("Decompress data: " + data);
        return data;
    }
}
