package com.lyn.demo.command.impl;

import com.lyn.demo.command.ICommand;
import com.lyn.demo.command.ReceiverTV;

public class OpenConcreteICommand extends AbstractICommand implements ICommand{
    
    public OpenConcreteICommand(ReceiverTV receiver){
        super(receiver);
    }
    /**
     * 执行操作
     */
    @Override
    public void execute(){
        System.out.println("-------记录打开操作日志---start--");
        this.getReceiver().actionOpen();
        System.out.println("-------记录打开操作日志---end--");
    }
}
