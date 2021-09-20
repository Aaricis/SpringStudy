package com.kuang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @program: com.kuang
 * @description: after log
 * @author: zkg
 * @create: 2021-09-07 08:46
 **/
public class AfterLog implements AfterReturningAdvice {

    //returnVale:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为："+returnValue);
    }
}
