package com.keyon.design.decorator;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    void writeData(String data) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            sb.append((char) (data.charAt(i) + 1));
        }
        String encryptData = sb.toString();
        System.out.println("Encrypt data: " + encryptData);
        super.writeData(encryptData);
    }

    @Override
    String readData() {
        String data = super.readData();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            sb.append((char) (data.charAt(i) - 1));
        }
        String decryptData = sb.toString();
        System.out.println("Decrypt data: " + decryptData);
        return decryptData;
    }
}
