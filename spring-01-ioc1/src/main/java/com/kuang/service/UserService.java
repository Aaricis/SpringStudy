package com.kuang.service;

import com.kuang.dao.UserDao;

public interface UserService {
    void setUserDao(UserDao userDao);
    void getUser();
}
