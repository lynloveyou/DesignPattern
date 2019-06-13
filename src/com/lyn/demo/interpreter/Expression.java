package com.lyn.demo.interpreter;

/**
 *表达式接口 
 */
public interface Expression{
    
    //解释文本内容
    public boolean interpret(String context);
}
