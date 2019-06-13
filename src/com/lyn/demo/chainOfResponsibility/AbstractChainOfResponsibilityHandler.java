package com.lyn.demo.chainOfResponsibility;

/**
  *抽象处理者角色(Handler:Approver):定义一个处理请求的接口，和一个后继连接(可选) 
  * 
  * 
  */
public abstract class AbstractChainOfResponsibilityHandler implements ChainOfResponsibilityHandler{
    private ChainOfResponsibilityHandler nextSuccessor;
    private String currentSuccessorName;
    
    public AbstractChainOfResponsibilityHandler(String currentSuccessorName){
        this.currentSuccessorName = currentSuccessorName;
    }

    @Override
    public void setNextSuccessor(ChainOfResponsibilityHandler nextSuccessor){
        this.nextSuccessor = nextSuccessor;
    }
    
    @Override
    public void setCurrentSuccessorName(String nextSuccessorName){
        this.currentSuccessorName = nextSuccessorName;
    }
    
    public ChainOfResponsibilityHandler getNextSuccessor(){
        return nextSuccessor;
    }
    
    public String getCurrentSuccessorName(){
        return currentSuccessorName;
    }

    @Override
    public void handlerRequest(AskForLeaveRequest request){
        System.out.println(this.getCurrentSuccessorName()+" request was passed");
    }
 
     
}
