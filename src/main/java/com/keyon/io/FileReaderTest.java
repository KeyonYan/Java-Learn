package com.keyon.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/com/keyon/io/test.txt");
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
