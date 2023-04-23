package com.keyon.nettyfuture;

import io.netty.channel.EventLoop;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.util.concurrent.DefaultPromise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws Exception{
        jdkFuture();
        nettyFuture();
        nettyPromise();
    }

    private static void jdkFuture() throws ExecutionException, InterruptedException {
        System.out.println(1);
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        java.util.concurrent.Future<String> task =
                threadPool.submit(() -> "JDK-Future");
        System.out.println(task.get());
        System.out.println(2);
        threadPool.shutdownNow();
    }

    private static void nettyFuture() {
        System.out.println(1);
        NioEventLoopGroup group = new NioEventLoopGroup();
        EventLoop eventLoop = group.next();

        io.netty.util.concurrent.Future<String> task =
                eventLoop.submit(() -> "Netty-Future");
        task.addListener(lisTask -> System.out.println(lisTask.getNow()));
        System.out.println(2);
        group.shutdownGracefully();
    }

    private static void nettyPromise() throws ExecutionException, InterruptedException {
        System.out.println(1);
        NioEventLoopGroup group = new NioEventLoopGroup();
        EventLoop eventLoop = group.next();

        DefaultPromise<String> promise = new DefaultPromise<>(eventLoop);
        new Thread(() -> {
            try {
                int i = 100 / 0;
                promise.setSuccess("Netty-Promise");
            } catch (Throwable throwable) {
                promise.setFailure(throwable);
            }
        }).start();
        System.out.println(promise.get());
        System.out.println(2);
    }
}
