package com.kuang.demo01;

/**
 * @program: com.kuang
 * @description: 代理，帮房东租房子
 * @author: zkg
 * @create: 2021-09-06 10:19
 **/
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() { // 代理帮房东租房子
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    //签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}
