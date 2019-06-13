package com.lyn.demo.interceptingFilter;

import com.lyn.demo.interceptingFilter.impl.AuthorFilter;
import com.lyn.demo.interceptingFilter.impl.DebugFilter;

public class InterceptingChainDemo{
    /**
     * 过滤器（Filter） - 过滤器在请求处理程序执行请求之前或之后，执行某些任务。
     * 过滤器链（Filter Chain） - 过滤器链带有多个过滤器，并在 Target 上按照定义的顺序执行这些过滤器。
     * Target - Target 对象是请求处理程序。
     * 过滤管理器（Filter Manager） - 过滤管理器管理过滤器和过滤器链。
     * 客户端（Client） - Client 是向 Target 对象发送请求的对象。
     */
    public static void main(String[] args){
       FilterManage filterManage = new FilterManage(new Target()); 
       Filter authorFilter = new AuthorFilter();
       Filter debugFilter = new DebugFilter();
       filterManage.attachFilter(authorFilter);
       filterManage.attachFilter(debugFilter);
       Client client = new Client();
       client.setFilterManage(filterManage);
       client.executeRequest("heheda");
    }
}
