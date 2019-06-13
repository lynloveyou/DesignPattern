package com.lyn.demo.mediator.impl;

import com.lyn.demo.mediator.AbstractMediator;
import com.lyn.demo.mediator.Colleague;
import com.lyn.demo.mediator.Mediator;

public class ConcreteMediator extends AbstractMediator implements Mediator{
    @Override
    public void operation(Colleague colleague,String message){
        String className = colleague.getClass().getSimpleName();
        String notifyClass = mapper.get(className);
        if(notifyClass==null||"".equals(notifyClass))
        {
            System.out.println("------------没有相应的接受对象------------");
           return; 
        }
        if(className.equals(notifyClass))
        {
            System.out.println("------------自己通知自己不处理------------");
            return;
        }
        //发给具体的接受对象
        Colleague notifycolleague = cacheObject.get(notifyClass);
        if(notifycolleague!=null)
        {
            notifycolleague.notifyMsg(message);
        }
        
    }
}
