package com.lyn.demo.observer;

/**
 *主题接口 
 */
public interface SubjectInterface{
    /**
     * 注册监听者
     * @param observer
     */
    public void attach(ObserverInterface observer);
    
    /**
     * 注销监听者
     * @param observer
     */
    public void detach(ObserverInterface observer);
    
    /**
     *通知所有监听对象 
     */
    public void notifyObserver();
    
    /**
     *获取状态值
     * @return
     */
    public int getState();
}
