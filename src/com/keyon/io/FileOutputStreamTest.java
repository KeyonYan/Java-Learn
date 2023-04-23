package com.keyon.io;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/com/keyon/io/test2.txt", true);
            fileOutputStream.write("abcde".getBytes()); // 写入abcde
            fileOutputStream.write("12345".getBytes(), 1, 3); // 写入234
            fileOutputStream.flush(); // 刷新缓冲区
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
