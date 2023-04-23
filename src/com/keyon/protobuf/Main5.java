package com.keyon.protobuf;

public class Main5 {

    public static void main(String[] args) {
        ProtoTest.getDescriptor().getServices().forEach(service -> {
            System.out.println(service.getName());
            service.getMethods().forEach(method -> {
                System.out.println(method.getName());
                System.out.println(method.getOptions());
            });
        });
    }
}
