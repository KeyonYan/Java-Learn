package com.keyon.design.bridge;

import com.keyon.design.bridge.device.Radio;
import com.keyon.design.bridge.device.TV;
import com.keyon.design.bridge.remote.Remote;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remoteControl = new Remote(tv);

        System.out.println(tv.isEnable()); // false
        remoteControl.togglePower();
        System.out.println(tv.isEnable()); // true

        System.out.println(tv.getVolume()); // 0
        remoteControl.volumeDown();
        System.out.println(tv.getVolume()); // -10
        remoteControl.volumeUp();
        System.out.println(tv.getVolume()); // 0

        System.out.println(tv.getChannel()); // 0
        remoteControl.channelDown();
        System.out.println(tv.getChannel()); // -1
        remoteControl.channelUp();
        System.out.println(tv.getChannel()); // 0

        Radio radio = new Radio();
        remoteControl = new Remote(radio);
        // ...
    }
}
