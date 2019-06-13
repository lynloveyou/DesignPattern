package com.lyn.demo.mediator.impl;

import com.lyn.demo.mediator.AbstractColleague;
import com.lyn.demo.mediator.Colleague;
import com.lyn.demo.mediator.Mediator;

public class ConcreteColleague2 extends AbstractColleague implements Colleague{
    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String sendMsg){
        this.mediator.operation(this,sendMsg);
    }

    @Override
    public void notifyMsg(String receiveMsg){
        System.out.println("concreteColleague2 print msg: "+receiveMsg);
    }
}
