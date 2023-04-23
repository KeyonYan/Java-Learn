package com.keyon.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/com/keyon/io/test.txt");
        byte[] bytes = new byte[1024];
        int readCount = 0;
        while ((readCount = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, readCount));
        }
        fileInputStream.close();
    }

    public static void main2(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/com/keyon/io/test.txt");
        System.out.println(fileInputStream.available()); // 文件有效字节数 41
        System.out.println((char) fileInputStream.read()); // a
        System.out.println(fileInputStream.available()); // 文件有效字节数 40
        byte[] bytes = new byte[2];
        fileInputStream.read(bytes); // return 2
        System.out.println(new String(bytes)); // bc
        fileInputStream.skip(1); // 跳过一个字节
        System.out.println((char) fileInputStream.read()); // e
        fileInputStream.close(); // 关闭流
    }

}
