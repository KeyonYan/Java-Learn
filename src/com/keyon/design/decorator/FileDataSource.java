package com.keyon.design.decorator;

public class FileDataSource extends DataSource {
    private String fileName;
    private String data;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void writeData(String data) {
        System.out.println("Write data to file: " + fileName);
        this.data = data;
    }

    @Override
    String readData() {
        System.out.println("Read data from file: " + fileName);
        return this.data;
    }

}
