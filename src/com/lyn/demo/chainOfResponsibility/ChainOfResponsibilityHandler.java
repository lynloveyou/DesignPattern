package com.lyn.demo.chainOfResponsibility;

public interface ChainOfResponsibilityHandler{
    
    /**
     * 设置下个处理者
     * @param nextSuccessor
     */
    public void setNextSuccessor(ChainOfResponsibilityHandler nextSuccessor);
    
    /**
     * 设置下个处理者名称
     * @param nextSuccessorName
     */
    public void setCurrentSuccessorName(String nextSuccessorName);
    
    /**
     * 接受请求
     * @param request
     */
    public void accessRequest(AskForLeaveRequest request);
    
    /**
     * 处理请求
     * @param request
     */
    public void handlerRequest(AskForLeaveRequest request);
    
}
