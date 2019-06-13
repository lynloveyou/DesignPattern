package com.lyn.demo.visitor;

//对象结构中的元素
public interface Element{
     //接受访问者用于访问数据
     public void accept(Visitor vistor);
}
