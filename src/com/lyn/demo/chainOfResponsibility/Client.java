package com.lyn.demo.chainOfResponsibility;

import com.lyn.demo.chainOfResponsibility.impl.ConcreteHandlerGeneralManager;
import com.lyn.demo.chainOfResponsibility.impl.ConcreteHandlerLeader;
import com.lyn.demo.chainOfResponsibility.impl.ConcreteHandlerManager;

public class Client{
   
    /**
     * 适用性
		在以下条件下使用Responsibility 链：
		• 有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
		• 你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
		•可动态指定一组对象处理请求。
     * 
     * 模式的组成
     * 抽象处理者角色(Handler:Approver):定义一个处理请求的接口，和一个后继连接(可选)
     * 具体处理者角色(ConcreteHandler:President):处理它所负责的请求，可以访问后继者，如果可以处理请求则处理，否则将该请求转给他的后继者。
     * 客户类(Client):向一个链上的具体处理者ConcreteHandler对象提交请求。
     * @param args
     */
    public static void main(String[] args){
        //写一个请假条
        AskForLeaveRequest johnaflr = new AskForLeaveRequest("john",2.5F,"我去出去看看");
        //写一个请假条
        AskForLeaveRequest lynaflr = new AskForLeaveRequest("lyn",10.5F,"我去出去看看");
        //创建处理链
        ConcreteHandlerLeader chl = new ConcreteHandlerLeader("项目主管");
        ConcreteHandlerManager chm = new ConcreteHandlerManager("部门经理");
        ConcreteHandlerGeneralManager chgm = new ConcreteHandlerGeneralManager("总经理");
        chl.setNextSuccessor(chm);
        chm.setNextSuccessor(chgm);
        //开始处理请求
        System.out.println("-----------开始处理john----------");
        chl.accessRequest(johnaflr); 
        System.out.println("-----------开始处理lyn----------");
        chl.accessRequest(lynaflr);
    }
}
