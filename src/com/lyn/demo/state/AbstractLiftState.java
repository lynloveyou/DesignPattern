package com.lyn.demo.state;

public abstract class AbstractLiftState implements LiftState{
    protected Context context;
    
    @Override
    public void setContext(Context context){
        this.context = context;
    }
}
