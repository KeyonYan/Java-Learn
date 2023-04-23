package com.keyon.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect // 切面
@Component
public class WAspect {

    @Pointcut("execution(* com.keyon.aop.*.*(..))")
    public void point() {

    }

    // 切点上进行前置通知
    @Before("point()")
    public void beforeAd() {
        System.out.println("before...");
    }


    @After("point()")
    public void afterAd() {
        System.out.println("after...");
    }
}
