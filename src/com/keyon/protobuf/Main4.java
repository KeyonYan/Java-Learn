package com.keyon.protobuf;


import com.google.protobuf.*;

public class Main4 {

    public static void main(String[] args) throws InvalidProtocolBufferException {
       ProtoTest.Msg msg = ProtoTest.Msg.newBuilder()
                .setId(1)
                .setCreateTime("2023-04-17")
                .setContent("hello")
                .build();
        System.out.println(msg);
        String hello = msg.getDescriptorForType().getOptions().getExtension(ProtoTest.hello);
        System.out.println(hello);
        System.out.println(ProtoTest.hello);
        for (int i = 0; i < ProtoTest.Msg.getDescriptor().getFields().size(); i++) {
            System.out.println(ProtoTest.Msg.getDescriptor().getFields().get(i) + ":");
            System.out.println(ProtoTest.Msg.getDescriptor().getFields().get(i).getOptions());
            System.out.println("-------------");
        }
    }
}
