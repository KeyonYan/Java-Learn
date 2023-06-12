package com.keyon.bytebuf;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;

public class Main {

    public static void main(String[] args) {
        ByteBuf buf = Unpooled.buffer(10); // 堆缓冲区
        ByteBuf buf2 = Unpooled.buffer(10); // 堆缓冲区
        ByteBuf buf3 = Unpooled.directBuffer();
        CompositeByteBuf comBuf = Unpooled.compositeBuffer(); // 组合buf

        buf.writeInt(6);
        System.out.println("buf.readableBytes() = " + buf.readableBytes());
//        System.out.println("buf.readInt() = " + buf.readInt());
//        System.out.println("buf.readableBytes() = " + buf.readableBytes());

        buf2.writeBoolean(true);
        System.out.println("buf.readableBytes() = " + buf2.readableBytes());
//        System.out.println("buf.readInt() = " + buf.readBoolean());
//        System.out.println("buf.readableBytes() = " + buf.readableBytes());

        comBuf.addComponents(true, buf, buf2);
        System.out.println("comBuf.readableBytes() = " + comBuf.readableBytes());
        System.out.println("comBuf.readInt() = " + comBuf.readInt());
        System.out.println("comBuf.readBoolean(); = " + comBuf.readBoolean());
    }


//    private static void testDirectByteBuf() {
//        ByteBuf dirBuf = Unpooled.directBuffer(10); // 直接内存缓冲区
//        if (!dirBuf.hasArray()) {
//            int length = dirBuf.readableBytes();
//
//        }
//    }
}
