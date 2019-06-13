package com.lyn.demo.command.impl;

import com.lyn.demo.command.ICommand;
import com.lyn.demo.command.ReceiverTV;

public class CloseConcreteICommand extends AbstractICommand implements ICommand{
    public CloseConcreteICommand(ReceiverTV receiver){
        super(receiver);
    }

    @Override
    public void execute(){
        System.err.println("-------记录关闭操作日志---start--");
        this.getReceiver().actionClose();
        System.err.println("-------记录关闭操作日志---end--");
    }
}
