package com.lyn.demo.chainOfResponsibility.impl;

import com.lyn.demo.chainOfResponsibility.AbstractChainOfResponsibilityHandler;
import com.lyn.demo.chainOfResponsibility.AskForLeaveRequest;
import com.lyn.demo.chainOfResponsibility.ChainOfResponsibilityHandler;

public class ConcreteHandlerGeneralManager extends AbstractChainOfResponsibilityHandler implements ChainOfResponsibilityHandler{
    
    public ConcreteHandlerGeneralManager(String currentSuccessorName){
        super(currentSuccessorName);
    }

    //处理请求
    @Override
    public void accessRequest(AskForLeaveRequest request){
        System.out.println(this.getCurrentSuccessorName()+" was signed ");
        if(request.getDays()>3)
        {
            this.handlerRequest(request);
            return;
        }
        //传递个下一个处理者
        if(this.getNextSuccessor() instanceof ChainOfResponsibilityHandler)
        {
            this.getNextSuccessor().accessRequest(request);
        }
    }
}
