package com.keyon.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        User user = new User(1, "a");
        User user2 = user;
        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        for (User u : list) {
            System.out.println(u.hashCode());
        }
    }

}
