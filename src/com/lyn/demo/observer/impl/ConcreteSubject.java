package com.lyn.demo.observer.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.lyn.demo.observer.ObserverInterface;
import com.lyn.demo.observer.SubjectInterface;

public class ConcreteSubject implements SubjectInterface{
    //全局单例模式
    private static ConcreteSubject subject;
    //注册了的监听者
    private Map<String,ObserverInterface> map;
    //对象状态
    private int state;
    //构造方法私有化
    private ConcreteSubject(){
        map = new HashMap<String,ObserverInterface>();
    };
    public static ConcreteSubject getInstance()
    {
        if(subject==null)
        {
            subject = new ConcreteSubject();
        }
        return subject;
    }
    
    //注册监听者
    @Override
    public void attach(ObserverInterface observer){
        this.map.put(observer.toString(), observer);
    }

    //是否监听者
    @Override
    public void detach(ObserverInterface observer){
        this.map.remove(observer.toString());
    }

    //通知了所有监听者
    @Override
    public void notifyObserver(){
       Collection<ObserverInterface> observers = map.values();
       for(ObserverInterface observer:observers)
       {
           if(observer.getState()==this.getState()){
               observer.update(this);
           }
       }
    }
    
    @Override
    public int getState(){
        return state;
    }
    
    public void setState(int state){
        this.state = state;
        this.notifyObserver();
    }
    
}
