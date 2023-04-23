package com.keyon.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/com/keyon/io/test2.txt", true);
            fileWriter.write("abcde"); // 写入abcde
            fileWriter.write("12345", 1, 3); // 写入234
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
