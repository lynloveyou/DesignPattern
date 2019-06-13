package com.lyn.demo.interceptingFilter;

/**
 * 实际处理 
 */
public class Target{
    public void execute(String request)
    {
        System.out.println("execute request:"+request);
    }
}
