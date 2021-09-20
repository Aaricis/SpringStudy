package com.kuang.demo02;

/**
 * @program: com.kuang
 * @description: 代理角色
 * @author: zkg
 * @create: 2021-09-06 11:42
 **/
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //日志方法
    public void log(String msg){
        System.out.println("[DEBUG]使用了"+msg+"方法");
    }
}
