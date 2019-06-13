package com.lyn.demo.chainOfResponsibility.impl;

import com.lyn.demo.chainOfResponsibility.AbstractChainOfResponsibilityHandler;
import com.lyn.demo.chainOfResponsibility.AskForLeaveRequest;
import com.lyn.demo.chainOfResponsibility.ChainOfResponsibilityHandler;

public class ConcreteHandlerLeader extends AbstractChainOfResponsibilityHandler implements ChainOfResponsibilityHandler{
   
    public ConcreteHandlerLeader(String currentSuccessorName){
        super(currentSuccessorName);
    }

    //接受请求
    @Override
    public void accessRequest(AskForLeaveRequest request){
        System.out.println(this.getCurrentSuccessorName()+"was known");
        if(request.getDays()<=0.5)
        {
            handlerRequest(request);
            return;
        }
        //传递个下一个处理者
        if(this.getNextSuccessor() instanceof ChainOfResponsibilityHandler)
        {
            this.getNextSuccessor().accessRequest(request);
        }
    }
    

}
