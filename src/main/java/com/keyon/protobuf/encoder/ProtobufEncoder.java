package com.keyon.protobuf.encoder;

import com.keyon.protobuf.MsgProto;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class ProtobufEncoder extends MessageToByteEncoder<MsgProto.Msg> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MsgProto.Msg msgProto, ByteBuf byteBuf) throws Exception {
        byte[] bytes = msgProto.toByteArray();
        int length = bytes.length;
        byteBuf.writeShort(length); // 2Byte
        byteBuf.writeBytes(bytes);
    }
}
