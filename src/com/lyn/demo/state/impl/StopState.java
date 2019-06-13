package com.lyn.demo.state.impl;

import com.lyn.demo.state.AbstractLiftState;
import com.lyn.demo.state.Context;
import com.lyn.demo.state.LiftState;

public class StopState extends AbstractLiftState implements LiftState{
    @Override
    public void open(){
        this.context.setLiftState(Context.openState);
        this.context.open();
    }

    @Override
    public void close(){
        System.out.println("------close---do nothing------door is close---");
    }

    @Override
    public void run(){
        this.context.setLiftState(Context.runState);
        this.context.run();
    }

    @Override
    public void stop(){
        System.out.println("------lift is stop----");
    }
}
