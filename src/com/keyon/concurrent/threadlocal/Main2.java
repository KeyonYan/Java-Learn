package com.keyon.concurrent.threadlocal;

import lombok.*;

public class Main2 {
    public static ThreadLocal<User> localVariable = new InheritableThreadLocal<>();

    @AllArgsConstructor
    @ToString
    @Setter
    static class User {
        private Integer id;
        private String name;
    }

    static void print(String str) {
        System.out.println(str + ":" + localVariable.get().toString());
        localVariable.remove();
    }

    public static void main(String[] args) throws InterruptedException {
        localVariable.set(new User(1, "Fa"));
        Thread t1 = new Thread(() -> {
            User user = localVariable.get();
            System.out.println("Ch Thread: " + user.toString());
            user.setName("Ch");
        });
        t1.start();
        Thread.sleep(1000);
        print("Fa Thread");
    }
}
