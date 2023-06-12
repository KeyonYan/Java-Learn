package com.keyon.protobuf.decoder;

import com.keyon.protobuf.MsgProto;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

public class ProtobufDecoder extends ByteToMessageDecoder {
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byteBuf.markReaderIndex();
        if (byteBuf.readableBytes() < 2) { // Short: 2Byte
            return;
        }
        short length = byteBuf.readShort();
        if (length < 0) {
            channelHandlerContext.close(); // 非法数据，关闭
        }
        if (byteBuf.readableBytes() < length) {
            byteBuf.resetReaderIndex(); // 读取的数据不够，重置读取位置并返回
            return;
        }
        byte[] bytes;
        if (byteBuf.hasArray()) { // 堆缓冲
            ByteBuf slice = byteBuf.slice();
            bytes = slice.array();
        } else {
            bytes = new byte[length]; // 直接缓冲
            byteBuf.readBytes(bytes, 0, length);
        }
        MsgProto.Msg msg = MsgProto.Msg.parseFrom(bytes);
        if (msg != null) {
            list.add(msg);
        }
    }
}
