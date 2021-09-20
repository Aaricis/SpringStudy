package com.kuang.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: com.kuang
 * @description: 代理调用处理程序
 * @author: zkg
 * @create: 2021-09-06 14:19
 **/

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是使用反射机制实现
        log(method.getName());
        Object result =  method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("[DEBUG]使用了"+msg+"方法");
    }
}
