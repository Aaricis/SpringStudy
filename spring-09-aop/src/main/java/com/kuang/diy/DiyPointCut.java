package com.kuang.diy;

/**
 * @program: com.kuang
 * @description: 自定义类
 * @author: zkg
 * @create: 2021-09-07 09:30
 **/
public class DiyPointCut {
    public void before(){
        System.out.println("方法执行前");
    }
    public void after(){
        System.out.println("方法执行后");
    }
}
