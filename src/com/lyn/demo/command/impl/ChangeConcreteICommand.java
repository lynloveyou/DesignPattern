package com.lyn.demo.command.impl;

import com.lyn.demo.command.ICommand;
import com.lyn.demo.command.ReceiverTV;

public class ChangeConcreteICommand extends AbstractICommand implements ICommand{
    public ChangeConcreteICommand(ReceiverTV receiver){
        super(receiver);
    }

    @Override
    public void execute(){
        System.err.println("-------记录更换平道操作日志---start--");
        this.getReceiver().actionChange();
        System.err.println("-------记录更换平道操作日志---end--");
    }
}
