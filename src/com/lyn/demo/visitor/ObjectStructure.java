package com.lyn.demo.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构 即元素的集合
 */
public class ObjectStructure{
    //元素集合
    private List<Element> objcollection;
    
    public ObjectStructure(){
        this.objcollection = new ArrayList<Element>();
    }

    public void attach(Element element)
    {
        objcollection.add(element);
    }
    
    public void detach(Element element)
    {
        objcollection.remove(element);
    }
    
    //接受访问者然后开始遍历数据进行访问者读取数据
    public void accept(Visitor visitor)
    {
        for(Element element:objcollection)
        {
            element.accept(visitor);
        }
    }
    
}
