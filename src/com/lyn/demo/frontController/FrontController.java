package com.lyn.demo.frontController;

import java.util.Date;

public class FrontController{
    private static FrontController frontController;
    private Dispatcher dispatcher;

    
    private FrontController(){
        this.dispatcher = Dispatcher.getInstance();
    }
    
    public static synchronized FrontController getInstance()
    {
        if(frontController==null)
        {
            frontController = new FrontController();
        }
        return frontController;
    }
    
    //记录请求时间
    public void logTime(long startTime)
    {
       System.out.println((System.currentTimeMillis()-startTime)+"ms"); 
    }
    
    //跟踪用户请求路径
    public void trackRequest(String request)
    {
        System.out.println("Page requested: "+request);
    }
    
    //验证用户是否为有效用户
    public boolean isAuthorUser()
    {
        System.out.println("user author success");
        return true;
    }
    
    //通过调度器转发请求
    public void dispathRequest(String request)
    {
        //记录开始时间
        long startTime = System.currentTimeMillis();
        //跟踪请求
        trackRequest(request);
        //校验用户
        if(isAuthorUser())
        {
            ViewInterface dispath = dispatcher.dispath(request);
            dispath.show();
            logTime(startTime);
        }
    } 
   
}
