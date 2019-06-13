package com.lyn.demo.interpreter.impl;

import com.lyn.demo.interpreter.Expression;

public class TerminalExpression implements Expression{
    private String data;
    
    public TerminalExpression(String data){
        this.data = data;
    }

    //解释内容
    @Override
    public boolean interpret(String context){
        if(context==null||"".equals(context.trim()))
        {
            return false;
        }
        return context.contains(data);
    }
}
