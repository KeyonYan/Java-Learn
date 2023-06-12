package com.keyon.aop;

import org.springframework.stereotype.Component;

@Component
public class IndexDao implements Dao{
    public void query() {
        System.out.println("query...");
    }
}
