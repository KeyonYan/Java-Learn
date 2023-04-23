package com.keyon.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAsepct {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Wconfig.class);
        Dao dao = configApplicationContext.getBean(Dao.class);
        dao.query();
    }
}
