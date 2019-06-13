package com.lyn.demo.visitor;

import com.lyn.demo.visitor.impl.ConcreteElementA;
import com.lyn.demo.visitor.impl.ConcreteElementB;

/**
 * 访问者接口
 */
public interface Visitor{
    
    //访问A元素
    public void visit(ConcreteElementA element);
    
    //访问B元素
    public void visit(ConcreteElementB element);
}
