package com.kuang.demo02;

/**
 * @program: com.kuang
 * @description: 真实对象，实现UserService
 * @author: zkg
 * @create: 2021-09-06 11:34
 **/
public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("修改了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
