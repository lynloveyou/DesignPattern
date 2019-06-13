package com.lyn.demo.frontController.impl;

import com.lyn.demo.frontController.ViewInterface;

public class DefaultNilView implements ViewInterface{
    @Override
    public void show(){
        System.out.println("do nothing ");
    }

    @Override
    public String getPath(){
        return "";
    }
}
