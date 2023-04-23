package com.keyon.protobuf;

public class Test {

    public static void main(String[] args) {
        ProtoMsg.LoginRequest.Builder loginReq = ProtoMsg.LoginRequest.newBuilder()
                .setUid("123")
                .setDeviceId("123")
                .setToken("123")
                .setPlatform(1)
                .setAppVersion("1.0.0");
        ProtoMsg.LoginResponse.Builder loginRsp = ProtoMsg.LoginResponse.newBuilder()
                .setResult(true)
                .setCode(200)
                .setInfo("success")
                .setExpose(1);
        ProtoMsg.Message.Builder builder = ProtoMsg.Message.newBuilder()
                .setType(ProtoMsg.HeadType.LOGIN_REQUEST)
                .setSequence(1)
                .setSessionId("123456")
                .setLoginRequest(loginReq);
        System.out.println(builder.getLoginRequest());
        builder.setLoginResponse(loginRsp);
        System.out.println(builder.getLoginRequest());
        System.out.println(builder.getLoginResponse());
    }
}
