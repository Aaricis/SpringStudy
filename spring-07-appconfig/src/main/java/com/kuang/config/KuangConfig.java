package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: com.kuang
 * @description: configration
 * @author: zkg
 * @create: 2021-09-02 20:08
 **/

//本来就是一个@Component，被Spring容器托管，注册到容器中；
//@Configuration代表这是一个注册类，相当于beans.xml
@Configuration
@Import(KuangConfig2.class)
public class KuangConfig {
    @Bean
    //相当于bean标签
    //bean的id为方法名"getUser"，class为返回值
    public User getUser(){
        return new User(); //返回要注入到bean的对象
    }
}
