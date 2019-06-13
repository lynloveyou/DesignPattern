package com.lyn.demo.command;

import java.util.HashMap;
import java.util.Map;

public class InvokerController{
    
    private  Map<String,ICommand> commandMap;

    public InvokerController(){
        commandMap = new HashMap<String,ICommand>();
    }
    
    public void addCommand(ICommand command)
    {
        commandMap.put(command.getClass().getSimpleName(), command);
    }
    
    public void runCommand(String conmandName)
    {
        System.out.println("---------invoker------调用记录-start--");
        this.commandMap.get(conmandName).execute();
        System.out.println("---------invoker------调用记录-end--");
    }
    
}
