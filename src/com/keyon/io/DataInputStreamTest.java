package com.keyon.io;

import java.io.*;

public class DataInputStreamTest {

    public static void main(String[] args) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/com/keyon/io/test3.txt"));
        dataOutputStream.writeUTF("abcde");
        dataOutputStream.writeInt(12345);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeChar('a');
        dataOutputStream.writeDouble(3.14);
        dataOutputStream.writeFloat(3.14f);
        dataOutputStream.writeLong(1234567890L);
        dataOutputStream.writeShort(123);
        dataOutputStream.flush();
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/com/keyon/io/test3.txt"));
        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readDouble());
        System.out.println(dataInputStream.readFloat());
        System.out.println(dataInputStream.readLong());
        System.out.println(dataInputStream.readShort());
        dataInputStream.close();
    }
}
