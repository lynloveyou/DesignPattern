package com.lyn.demo.mediator;

public interface Colleague{
    
    /**
     * 发送消息
     * @param sendMsg
     */
    public void send(String sendMsg);
    
    /**
     * 接受的消息
     * @param receiveMsg
     */
    public void notifyMsg(String receiveMsg);
}
