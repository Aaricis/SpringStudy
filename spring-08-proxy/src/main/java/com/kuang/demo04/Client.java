package com.kuang.demo04;

import com.kuang.demo02.UserService;
import com.kuang.demo02.UserServiceImpl;
import com.kuang.demo02.UserServiceProxy;

import javax.jws.soap.SOAPBinding.Use;

/**
 * @program: com.kuang
 * @description:
 * @author: zkg
 * @create: 2021-09-06 15:43
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService); //设置要代理的对象
        UserService proxy = (UserService) pih.getProxy(); //动态生成代理类
        proxy.add();
        proxy.query();
    }
}
