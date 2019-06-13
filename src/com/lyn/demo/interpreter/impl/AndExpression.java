package com.lyn.demo.interpreter.impl;

import com.lyn.demo.interpreter.Expression;

//解释语句中and内容
public class AndExpression implements Expression{
    private Expression expre1;
    private Expression expre2;
    
    public AndExpression(Expression expre1, Expression expre2){
        this.expre1 = expre1;
        this.expre2 = expre2;
    }
    
    //解释AND操作
    @Override
    public boolean interpret(String context){
        return expre1.interpret(context)&&expre2.interpret(context);
    }
}
