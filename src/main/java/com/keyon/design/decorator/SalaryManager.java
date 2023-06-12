package com.keyon.design.decorator;

public class SalaryManager {

    DataSource dataSource;

    public SalaryManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    void load() {
        String data = dataSource.readData();
        System.out.println("Load data: " + data);
    }

    void save(String salary) {
        dataSource.writeData(salary);
        System.out.println("Save data: " + salary);
    }
}
