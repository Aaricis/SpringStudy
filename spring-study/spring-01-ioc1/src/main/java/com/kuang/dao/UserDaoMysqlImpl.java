package com.kuang.dao;

import com.kuang.service.UserServiceImpl;

public class UserDaoMysqlImpl implements UserDao {
    public void getUser() {
        System.out.println("Mysql获取用户数据！");
    }
}
