package com.lyn.demo.command.impl;

import com.lyn.demo.command.ICommand;
import com.lyn.demo.command.ReceiverTV;

public abstract class AbstractICommand implements ICommand{
    private ReceiverTV receiver;

    /** 
     * 构造方法，传入相应的接收者对象 
     * @param receiver 相应的接收者对象 
     */  
    public AbstractICommand(ReceiverTV receiver){
        this.receiver = receiver;
    }

    public ReceiverTV getReceiver(){
        return receiver;
    }

    public void setReceiver(ReceiverTV receiver){
        this.receiver = receiver;
    }
    
}
