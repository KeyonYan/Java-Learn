package com.keyon.protobuf;


import com.google.protobuf.InvalidProtocolBufferException;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // 生成POJO
        MsgProto.Msg.Builder builder = MsgProto.Msg.newBuilder();
        builder.setId(1);
        builder.setContent("Hello World");
        MsgProto.Msg msg = builder.build();
        System.out.println("Before Serialize POJO: " + msg.toString());

        // 序列化
        byte[] sendData = msg.toByteArray();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(sendData, 0, sendData.length);
        // 反序列化
        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        byte[] receiveData = new byte[inputStream.available()];
        inputStream.read(receiveData);
        MsgProto.Msg receiveMsg = MsgProto.Msg.parseFrom(receiveData);
        System.out.println("Deserialize POJO: " + receiveMsg.toString());

    }

}
