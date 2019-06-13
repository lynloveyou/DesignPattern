package com.lyn.demo.command;

import com.lyn.demo.command.impl.OpenConcreteICommand;

public class Client{
    /**
     * 适用性
		1）系统需要将请求调用者和请求接收者解耦，使得调用者和接收者不直接交互。
		2）系统需要在不同的时间指定请求、将请求排队和执行请求。
		3）系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作。
		4）系统需要将一组操作组合在一起，即支持宏命令。
     * 
     * 模式的组成
     * 抽象命令类(Command): 声明执行操作的接口。调用接收者相应的操作，以实现执行的方法Execute。
     * 具体命令类(ConcreteCommand): 创建一个具体命令对象并设定它的接收者。通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。 
     * 调用者(Invoker): 要求该命令执行这个请求。通常会持有命令对象，可以持有很多的命令对象。
     * 接收者(Receiver): 知道如何实施与执行一个请求相关的操作。任何类都可能作为一个接收者,只要它能够实现命令要求实现的相应功能。 
     * 客户类(Client): 创建具体的命令对象，并且设置命令对象的接收者。真正使用命令的客户端是从Invoker来触发执行。
     * @param args
     */
    public static void main(String[] args){
        //真正操作的的类
        ReceiverTV receiver = new ReceiverTV();
        //创建命令对象，设定它的接收者  
        ICommand openCommand = new OpenConcreteICommand(receiver);
        //创建Invoker  
        InvokerController ic = new InvokerController();
        //把命令对象设置进调用遥控器 
        ic.addCommand(openCommand);
        //执行打开命令  
        ic.runCommand(OpenConcreteICommand.class.getSimpleName());
    }
}
