package com.springdubbo.yun.server;


//写一个实现类   （这个服务会被调用到，人家没有添加你的依赖也可以调用到？？对吧）
public class ServiceAPIimpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "看信息:quickstart-tong-message="+ message;
    }
}
