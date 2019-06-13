package com.lyn.demo.visitor.impl;

import com.lyn.demo.visitor.Visitor;

//定义一个B访问者只遍历B元素内容
public class ConcreteVisitorB implements Visitor{
    @Override
    public void visit(ConcreteElementA element){
        System.out.println("B 访问者不对A元素进行操作");
    }

    @Override
    public void visit(ConcreteElementB element){
        System.out.println("B 访问者访问B元素数据:"+element.getName());
    }
}
