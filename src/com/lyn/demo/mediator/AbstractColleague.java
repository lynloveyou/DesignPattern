package com.lyn.demo.mediator;

public abstract class AbstractColleague implements Colleague{
    protected Mediator mediator;
    
    public AbstractColleague(Mediator mediator){
        this.mediator = mediator;
        this.mediator.register(this);
    }
}
