package com.keyon.design.decorator;

public class ApplicationConfigurator {

    boolean enableEncryption = true;
    boolean enableCompression = true;

    public void configuration() {
        DataSource fileDataSource = new FileDataSource("test.txt");

        if (enableEncryption) {
            fileDataSource = new EncryptionDecorator(fileDataSource);
        }
        if (enableCompression) {
            fileDataSource = new CompressionDecorator(fileDataSource);
        }

        SalaryManager salaryManager = new SalaryManager(fileDataSource);
        salaryManager.save("salary data");
        salaryManager.load();
    }

    public static void main(String[] args) {
        ApplicationConfigurator configurator = new ApplicationConfigurator();
        configurator.configuration();
    }

}
