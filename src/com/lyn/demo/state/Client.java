package com.lyn.demo.state;

import com.lyn.demo.state.impl.CloseState;

public class Client{
    /**
     * 
     * 适用性
	 * 在下面的两种情况下均可使用State模式:
	 *	1) • 一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态改变它的行为。
	 *	2) • 代码中包含大量与对象状态有关的条件语句:一个操作中含有庞大的多分支的条件（if else(或switch case)语句，
	 *	且这些分支依赖于该对象的状态。这个状态通常用一个或多个枚举常量表示。通常 , 有多个操作包含这一相同的条件结构。 
	 *	State模式将每一个条件分支放入一个独立的类中。这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化。
     * 
     * 
     * 环境类（Context）:  定义客户感兴趣的接口。维护一个ConcreteState子类的实例，这个实例定义当前状态。
     * 抽象状态类（State）:  定义一个接口以封装与Context的一个特定状态相关的行为。
     * 具体状态类（ConcreteState）:  每一子类实现一个与Context的一个状态相关的行为。
     */
    public static void main(String[] args){
        Context context = new Context();
        context.setLiftState(new CloseState());
        context.open();
        context.close();
        context.run();
        context.stop(); 
        System.out.println("--"+System.getProperty("user.dir"));
        System.out.println("--"+System.getProperty("user.home"));
    }
}
