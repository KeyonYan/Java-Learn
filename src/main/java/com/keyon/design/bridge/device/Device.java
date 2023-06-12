package com.keyon.design.bridge.device;

/**
 * “实现部分”接口，只提供原语操作
 */
public abstract class Device {

    abstract public boolean isEnable();
    abstract public void enable();
    abstract public void disable();
    abstract public int getVolume();
    abstract public void setVolume(int percent);
    abstract public int getChannel();
    abstract public void setChannel(int channel);

}
