package com.keyon.protobuf;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) throws IOException {
        MsgProto.Msg msg = MsgProto.Msg.newBuilder()
                .setId(1)
                .setContent("Hello World")
                .build();
        System.out.println("Before Serialize POJO: " + msg.toString());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        msg.writeDelimitedTo(outputStream);
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        MsgProto.Msg receiveMsg = MsgProto.Msg.parseDelimitedFrom(inputStream);
        System.out.println("Deserialize POJO: " + receiveMsg.toString());
    }
}
