package com.lyn.demo.templateMethod;

import com.lyn.demo.templateMethod.impl.ConcreteDeposit;
import com.lyn.demo.templateMethod.impl.ConcreteTrancfer;
import com.lyn.demo.templateMethod.impl.ConcreteWithDraw;

public class Client{
    
    /**
     * 适用性
	 * 模板方法应用于下列情况：
	 * • 1） 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。
	 * • 2）各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。首先识别现有代码中的不同之处，并且将不同之处分离为新的操作。最后，
	 * 			用一个调用这些新的操作的模板方法来替换这些不同的代码。
	 * • 3）控制子类扩展。模板方法只在特定点调用“ hook”操作 ，这样就只允许在这些点进行扩展
     * 
     * 模式的组成
     * 抽象类（AbstractClass）: 定义抽象的原语操作（primitive operation） ，
     * 		具体的子类将重定义它们以实现一个算法， 实现一个模板方法,定义一个算法的骨架。该模板方法不仅调用原语操作，也调用定义
     * 具体子类 （ConcreteClass）:  实现原语操作以完成算法中与特定子类相关的步骤。
     *
     */
    public static void main(String[] args)
    {
        AbstractBank ab = new ConcreteWithDraw();
        ab.templateMethodProcess();
        System.out.println("-------------------------");
        ab = new ConcreteDeposit();
        ab.templateMethodProcess();
        System.out.println("-------------------------");
        ab = new ConcreteTrancfer();
        ab.templateMethodProcess();
        System.out.println("-------------------------");
        ab = new ConcreteWithDraw();
        ab.templateMethodProcess();
    }
}
