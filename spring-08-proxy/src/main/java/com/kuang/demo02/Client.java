package com.kuang.demo02;

/**
 * @program: com.kuang
 * @description:
 * @author: zkg
 * @create: 2021-09-06 11:38
 **/
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.delete();
    }
}
