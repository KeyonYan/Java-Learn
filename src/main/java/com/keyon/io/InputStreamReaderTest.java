package com.keyon.io;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        InputStreamReader inputStreamReader = null;
        try {
            inputStreamReader = new InputStreamReader(System.in);
            char[] chars = new char[4];
            int readCount = 0;
            while ((readCount = inputStreamReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, readCount));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
