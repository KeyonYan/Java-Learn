package com.keyon.design.bridge.device;

/**
 * “实现部分”接口的具体实现
 */
public class TV extends Device {

    private boolean enable = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
