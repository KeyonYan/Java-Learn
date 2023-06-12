package com.keyon.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream("src/com/keyon/io/test4.txt"));
        System.setOut(printStream);
        System.out.println("abcde");
    }

    public static void main2(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        printStream.println("abcde");
        printStream.println(true);
        printStream.println(123);
    }
}
