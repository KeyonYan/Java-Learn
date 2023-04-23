package com.keyon.design.decorator;

public class Application {

    public static void main(String[] args) {
        DataSource fileDataSource = new FileDataSource("test.txt");
        fileDataSource = new EncryptionDecorator(fileDataSource); // Encryption -> File
        fileDataSource.writeData("test data");
        fileDataSource.readData();

        System.out.println("=====================================");
        fileDataSource = new CompressionDecorator(fileDataSource); // Compression -> Encryption -> File
        fileDataSource.writeData("test data2");
        fileDataSource.readData();

    }
}
