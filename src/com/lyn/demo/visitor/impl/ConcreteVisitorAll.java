package com.lyn.demo.visitor.impl;

import com.lyn.demo.visitor.Visitor;

//定义一个All访问者只遍历所有元素内容
public class ConcreteVisitorAll implements Visitor{
    @Override
    public void visit(ConcreteElementA element){
        System.out.println("==All 访问者访问B元素数据:"+element.getName());
    }

    @Override
    public void visit(ConcreteElementB element){
        System.out.println("==All 访问者访问B元素数据:"+element.getName());
    }
    
}
