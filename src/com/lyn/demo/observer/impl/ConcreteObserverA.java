package com.lyn.demo.observer.impl;

import com.lyn.demo.observer.AbstractObserver;
import com.lyn.demo.observer.ObserverInterface;
import com.lyn.demo.observer.SubjectInterface;

public class ConcreteObserverA extends AbstractObserver implements ObserverInterface{
    public ConcreteObserverA(int state){
        super(state);
    }

    @Override
    public void update(SubjectInterface subject){
        System.out.println("ConcreteObserverA 获得通知得到主题的状态"+subject.getState());
    }
}
