package com.lyn.demo.observer;

public abstract class AbstractObserver implements ObserverInterface{
    private int state;
    public AbstractObserver(int state){
        this.state=state;
    }
    
    @Override
    public int getState(){
        return state;
    }
}
