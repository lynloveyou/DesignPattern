package com.lyn.demo.observer;

import com.lyn.demo.observer.impl.ConcreteObserverA;
import com.lyn.demo.observer.impl.ConcreteObserverB;
import com.lyn.demo.observer.impl.ConcreteSubject;

public class Client{
    
    /**
     * 适用性
	 *在以下任一情况下可以使用观察者模式:
	 *• 当一个抽象模型有两个方面, 其中一个方面依赖于另一方面。将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
	 *• 当对一个对象的改变需要同时改变其它对象 , 而不知道具体有多少对象有待改变。
	 *• 当一个对象必须通知其它对象，而它又不能假定其它对象是谁。换言之 , 你不希望这些对象是紧密耦合的。
	 *
     *观察者模式包含如下角色：
     *  目标（Subject）: 目标知道它的观察者。可以有任意多个观察者观察同一个目标。 提供注册和删除观察者对象的接口。
     *  具体目标（ConcreteSubject）:  将有关状态存入各ConcreteObserver对象。
     *  观察者(Observer):  为那些在目标发生改变时需获得通知的对象定义一个更新接口。当它的状态发生改变时, 向它的各个观察者发出通知。
     *  具体观察者(ConcreteObserver):   维护一个指向ConcreteSubject对象的引用。存储有关状态，这些状态应与目标的状态保持一致。
     *实现O b s e r v e r的更新接口以使自身状态与目标的状态保持一致。
     * @param args
     */
    public static void main(String[] args){
        ConcreteSubject instance = ConcreteSubject.getInstance();
        ObserverInterface observera = new ConcreteObserverA(1);
        ObserverInterface observerb = new ConcreteObserverB(2);
        instance.attach(observera);
        instance.attach(observerb);
        instance.setState(1);
        instance.setState(3);
        instance.setState(2);
    }
}
