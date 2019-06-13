package com.lyn.demo.frontController.impl;

import com.lyn.demo.frontController.ViewInterface;

public class HomeView implements ViewInterface{
    @Override
    public void show(){
        try{
            Thread.sleep(22);
            System.out.println("Displaying Home Page");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String getPath(){
        return "/front/controller/home";
    }
    
}
