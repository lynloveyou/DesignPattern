package com.lyn.demo.mediator;

import com.lyn.demo.mediator.impl.ConcreteColleague1;
import com.lyn.demo.mediator.impl.ConcreteColleague2;
import com.lyn.demo.mediator.impl.ConcreteColleague3;
import com.lyn.demo.mediator.impl.ConcreteColleague4;
import com.lyn.demo.mediator.impl.ConcreteMediator;

public class Client{
    /**
     * 适用性
     * 在下列情况下使用中介者模式:
	 * 1）系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解。
	 * 2）一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
	 * 3）一个对象引用其他很多对象并且直接与这些对象通信 ,导致难以复用该对象。
	 * 4）想通过一个中间类来封装多个类中的行为，而又不想生成太多的子类。可以通过引入中介者类来实现，在中介者中定义对象交互的公共行为，如果需要改变行为则可以增加新的中介者类。
     * 
     * 模式的组成
     * 抽象中介者(Mediator):中介者定义一个接口用于与各同事（Colleague）对象通信。
     * 具体中介者(ConcreteMediator): 具体中介者通过协调各同事对象实现协作行为。了解并维护它的各个同事。
     * 抽象同事类(Colleague class): 定义同事类接口,定义各同事的公有方法.
     * 具体同事类(ConcreteColleague): 实现抽象同事类中的方法。每一个同时类需要知道中介者对象；
     * 每个具体同事类只需要了解自己的行为，而不需要了解其他同事类的情况。每一个同事对象在需与其他的同事通信的时候，与它的中介者通信。
     */
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator); 
        ConcreteColleague3 colleague3 = new ConcreteColleague3(mediator); 
        ConcreteColleague4 colleague4 = new ConcreteColleague4(mediator); 
        colleague1.send("from colleague1 msg");
        colleague2.send("from colleague2 msg");
        colleague3.send("from colleague3 msg");
        colleague4.send("from colleague4 msg");
    }
}
