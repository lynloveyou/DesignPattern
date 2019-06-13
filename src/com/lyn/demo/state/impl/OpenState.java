package com.lyn.demo.state.impl;

import com.lyn.demo.state.AbstractLiftState;
import com.lyn.demo.state.Context;
import com.lyn.demo.state.LiftState;

public class OpenState extends AbstractLiftState implements LiftState{
    @Override
    public void open(){
        System.out.println("------lift is door open----------");   
    }

    @Override
    public void close(){
        this.context.setLiftState(Context.closeState);
        this.context.close();
    }

    @Override
    public void run(){
        System.out.println("-----run----do nothing------lift is runing---"); 
    }

    @Override
    public void stop(){
        System.out.println("-----stop----do nothing------lift is runing---");
    }
}
