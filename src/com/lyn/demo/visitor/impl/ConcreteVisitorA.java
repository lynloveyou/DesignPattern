package com.lyn.demo.visitor.impl;

import com.lyn.demo.visitor.Element;
import com.lyn.demo.visitor.Visitor;

//定义一个A访问者只遍历A元素内容
public class ConcreteVisitorA implements Visitor{
    @Override
    public void visit(ConcreteElementA element){
        System.out.println("A 访问者访问A元素数据:"+element.getName());
    }

    @Override
    public void visit(ConcreteElementB element){
        System.out.println("A 访问者不对B元素进行操作");
    }

}
