package com.lyn.demo.mediator;
/**
 * 中介者类
 * @author Administrator
 *
 */
public interface Mediator{
    
    //注册同事类
    public void register(Colleague colleague);
    
    //操作和发送消息
    public void operation(Colleague colleague,String message);
    
}
