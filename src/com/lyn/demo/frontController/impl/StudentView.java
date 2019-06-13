package com.lyn.demo.frontController.impl;

import com.lyn.demo.frontController.ViewInterface;

public class StudentView implements ViewInterface{
    @Override
    public void show(){
        try{
            Thread.sleep(13);
            System.out.println("Displaying Student Page");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Override
    public String getPath(){
        return "/front/controller/student";
    }
}
