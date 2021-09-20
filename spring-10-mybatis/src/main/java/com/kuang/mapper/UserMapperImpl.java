package com.kuang.mapper;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @program: com.kuang
 * @description: implement UserMapper
 * @author: zkg
 * @create: 2021-09-09 11:04
 **/
public class UserMapperImpl implements UserMapper{
    //原来，我们的所有操作都使用sqlSession来执行；现在，都使用sqlSessionTemplate;
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
