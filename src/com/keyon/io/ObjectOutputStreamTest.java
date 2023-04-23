package com.keyon.io;

import java.io.*;

public class ObjectOutputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Apple apple = new Apple(10);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/com/keyon/io/test5.txt"));
        objectOutputStream.writeObject(apple);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/com/keyon/io/test5.txt"));
        Apple apple1 = (Apple) objectInputStream.readObject();
        System.out.println(apple1);
    }

}

class Apple implements Serializable {
    private int price;

    public Apple(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "price=" + price +
                '}';
    }
}
