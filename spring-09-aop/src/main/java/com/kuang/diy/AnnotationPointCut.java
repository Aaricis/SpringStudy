package com.kuang.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.sql.SQLOutput;

/**
 * @program: com.kuang
 * @description: 使用注解实现aop
 * @author: zkg
 * @create: 2021-09-07 10:02
 **/

//方式三：使用注解方式实现aop
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.kuang.service.UserServiceImpl.* (..))")
    public void before(){
        System.out.println("方法执行前");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.* (..))")
    public void after(){
        System.out.println("方法执行后");
    }

    //在环绕增强中，可以给定一个参数，代表要获取切入的点
    @Around("execution(* com.kuang.service.UserServiceImpl.* (..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        Signature signature = joinPoint.getSignature();
        System.out.println("signature"+signature);
        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后");

    }

}
