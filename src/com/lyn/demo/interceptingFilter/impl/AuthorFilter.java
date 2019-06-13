package com.lyn.demo.interceptingFilter.impl;

import com.lyn.demo.interceptingFilter.Filter;

public class AuthorFilter implements Filter{
    @Override
    public void execute(String request){
        System.out.println("author request:"+request);
    }
}
