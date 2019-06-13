package com.lyn.demo.visitor;

import com.lyn.demo.visitor.impl.ConcreteElementA;
import com.lyn.demo.visitor.impl.ConcreteElementB;
import com.lyn.demo.visitor.impl.ConcreteVisitorA;
import com.lyn.demo.visitor.impl.ConcreteVisitorAll;
import com.lyn.demo.visitor.impl.ConcreteVisitorB;

public class Client{
    
    /**
     * 
     * 适用性
	 *在下列情况下使用Vi s i t o r模式：
	 *• 一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
	 *• 需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。 Visitor使得你可以将相关的操作集中起来定义在一个类中。当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
	 *• 定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。改变对象结构类需要重定义对所有访问者的接口，这可能需要很大的代价。如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。
     * 
     * 
     * 访问者模式包含如下角色：
     *抽象访问者（Vistor）: — 为该对象结构中ConcreteElement的每一个类声明一个Visit操作。该操作的名字和特
     *征标识了发送Visit请求给该访问者的那个类。这使得访问者可以确定正被访问元素
     *的具体的类。这样访问者就可以通过该元素的特定接口直接访问它。
     *具体访问者（ConcreteVisitor）: — 实现每个由Visitor声明的操作。每个操作实现本算法的一部分，而该算法片断乃是
     *对应于结构中对象的类。ConcreteVisitor为该算法提供了上下文并存储它的局部状态。
     *这一状态常常在遍历该结构的过程中累积结果。
     *抽象元素（Element）：定义一个Accept操作，它以一个访问者为参数。
     *具体元素（ConcreteElement）:   实现Accept操作，该操作以一个访问者为参数。
     *对象结构（ObjectStructure）: 能枚举它的元素。可以提供一个高层的接口以允许该访问者访问它的元素。可以是一个复合或是一个集合，如一个列表或一个无序集合。
     * @param args
     */
    public static void main(String[] args){
        ObjectStructure structure = new  ObjectStructure();
        ConcreteVisitorA visitora = new ConcreteVisitorA();
        ConcreteVisitorB visitorb = new ConcreteVisitorB();
        ConcreteVisitorAll visitorall = new ConcreteVisitorAll();
        ConcreteElementA elementa = new ConcreteElementA("Elemen a name WTFA");
        ConcreteElementB elementb = new ConcreteElementB("Elemen b name WTFB");
        ConcreteElementA elementa2 = new ConcreteElementA("Elemen a name WTFA2");
        structure.attach(elementa);
        structure.attach(elementb);
        structure.attach(elementa2);
        structure.accept(visitora);
        System.out.println("=====================");
        structure.accept(visitorb);
        System.out.println("=====================");
        structure.accept(visitorall);
    }
}
