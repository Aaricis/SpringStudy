package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @program: com.kuang
 * @description: 实现UserMapper的第二种方式
 * @author: zkg
 * @create: 2021-09-09 12:04
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
