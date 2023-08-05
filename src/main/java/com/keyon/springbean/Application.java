package com.keyon.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-config.xml");
        PersonBean personBean = (PersonBean) ctx.getBean("personBean");
        personBean.work();
        ((ClassPathXmlApplicationContext) ctx).destroy();
    }
}
