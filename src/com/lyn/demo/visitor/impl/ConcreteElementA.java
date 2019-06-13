package com.lyn.demo.visitor.impl;

import com.lyn.demo.visitor.Element;
import com.lyn.demo.visitor.Visitor;

//具体A元素，只是实现一个接口用于访问该元素使用
public class ConcreteElementA implements Element{
    private String name;
    
    public ConcreteElementA(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * 接受访问者调用它针对该元素的新方法
     * @param Visitor $visitor
     */
    @Override
    public void accept(Visitor vistor){
        vistor.visit(this);
    }
}
