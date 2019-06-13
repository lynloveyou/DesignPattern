package com.lyn.demo.observer;

/**
 * 观察者接口
 */
public interface ObserverInterface{
    
    //得到主题的通知
    public void update(SubjectInterface subject);
    
    //得到对象的自己状态，来决定是否处理
    public int getState();
}
