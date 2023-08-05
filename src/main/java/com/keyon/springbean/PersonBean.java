package com.keyon.springbean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PersonBean implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {
    private Integer no;
    private String name;

    public PersonBean() {
        System.out.println("1. 调用构造方法：出生");
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        System.out.println("2. 设置属性No：" + no);
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. 设置属性Name: " + name);
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("3. 调用BeanNameAware#setBeanName: " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("3. 调用BeanFactoryAware#setBeanFactory: " + beanFactory);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("5. InitalizationBean#afterPropertiesSet");
    }

    public void init() {
        System.out.println("6. init method");
    }

    public void work() {
        System.out.println("Bean using");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("9. DisposableBean#destroy");
    }

    public void destroyMethod() {
        System.out.println("10. destroy-method");
    }


}
