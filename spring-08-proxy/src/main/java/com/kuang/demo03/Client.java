package com.kuang.demo03;

/**
 * @program: com.kuang
 * @description:
 * @author: zkg
 * @create: 2021-09-06 15:11
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口对象
        pih.setRent(host);
        Rent proxy = (Rent) pih.getProxy(); //这里的代理类就是动态生成的，我们并没有写
        proxy.rent();
    }
}
