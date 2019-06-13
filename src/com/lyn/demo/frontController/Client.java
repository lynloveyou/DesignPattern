package com.lyn.demo.frontController;

public class Client{
    
    /**
     * 前端控制器（Front Controller） - 处理应用程序所有类型请求的单个处理程序，应用程序可以是基于 web 的应用程序，也可以是基于桌面的应用程序。
     * 调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序
     * 视图（View） - 视图是为请求而创建的对象。
     */
    public static void main(String[] args){
       String request1 ="/front/controller/home"; 
       String request2 ="/front/controller/student";
       String request3 ="/front/controller/XXX";
       FrontController frontController = FrontController.getInstance();
       frontController.dispathRequest(request1);
       frontController.dispathRequest(request2);
       frontController.dispathRequest(request3);
    }
}
