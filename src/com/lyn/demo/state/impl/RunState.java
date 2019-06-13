package com.lyn.demo.state.impl;

import com.lyn.demo.state.AbstractLiftState;
import com.lyn.demo.state.Context;
import com.lyn.demo.state.LiftState;

public class RunState extends AbstractLiftState implements LiftState{
    @Override
    public void open(){
        System.out.println("-----open----do nothing------lift is runing---");
    }

    @Override
    public void close(){
        System.out.println("-----close----do nothing------lift is runing---");
    }

    @Override
    public void run(){
       System.out.println("------lift is run----------");
    }

    @Override
    public void stop(){
       this.context.setLiftState(Context.stopState);
       this.context.stop();
    }
}
