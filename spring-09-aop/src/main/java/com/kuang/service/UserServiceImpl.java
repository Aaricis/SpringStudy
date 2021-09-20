package com.kuang.service;

/**
 * @program: com.kuang
 * @description: 实现类
 * @author: zkg
 * @create: 2021-09-06 17:09
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

    public void select() {
        System.out.println("选择了一个用户");
    }
}
