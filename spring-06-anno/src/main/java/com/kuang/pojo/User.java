package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: com.kuang
 * @description: User
 * @author: zkg
 * @create: 2021-08-29 21:56
 **/

//等价于<bean id = "user" class = "com.kung.pojo.User"/>
@Component
public class User {
    //public String name = "秦疆";

    //相当于<property name = "name" value = "kuangshen"/>

    public String name;
    @Value("kuangshen")
    public void setName(String name) {
        this.name = name;
    }
}
