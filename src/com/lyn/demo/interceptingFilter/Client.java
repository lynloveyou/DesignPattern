package com.lyn.demo.interceptingFilter;

/**
 * 模拟用户请求 
 */
public class Client{
    private FilterManage filterManage;
    
    public Client(){
    }
    
    public void setFilterManage(FilterManage filterManage){
        this.filterManage = filterManage;
    }
    
    public void executeRequest(String request)
    {
        filterManage.execute(request);
    }
}
