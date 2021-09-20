package com.kuang.demo01;

/**
 * @program: com.kuang
 * @description: 我要租房子
 * @author: zkg
 * @create: 2021-09-06 10:09
 **/
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();

        //代理，中介帮房东租房子；但是呢？代理角色一般会有一些附属操作
        Proxy proxy =  new Proxy(host); //代理找房东

        //你不用面对房东，直接找中介即可！
        proxy.rent();
    }
}
