package com.keyon.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return user.getName().equals(user);
    }
}