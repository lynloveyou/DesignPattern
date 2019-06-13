package com.lyn.demo.decorator;

import com.lyn.demo.decorator.impl.ConcreteComponentTextInput;
import com.lyn.demo.decorator.impl.ConcreteDecoratorInvalid;
import com.lyn.demo.decorator.impl.ConcreteDecoratorLabeled;

public class Client {
	/**
	 * 适用性
	 * 以下情况使用Decorator模式
	    1)• 在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
		2)• 处理那些可以撤消的职责。
		3)• 当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展，
		为支持每一种组合将产生大量的子类，使得子类数目呈爆炸性增长。
		另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类。
	 *	
	 *构建模式的组成
		1)•抽象组件角色(Component)：定义一个对象接口，以规范准备接受附加责任的对象，
			即可以给这些对象动态地添加职责。
		2)•具体组件角色(ConcreteComponent) :被装饰者，定义一个将要被装饰增加功能的类。
			可以给这个类的对象添加一些职责
		3)•抽象装饰器(Decorator):维持一个指向构件Component对象的实例，
			并定义一个与抽象组件角色Component接口一致的接口
		4)•具体装饰器角色（ConcreteDecorator):向组件添加职责。
	 *
	 */

	public static void main(String[] args) {
		ComponentWidget cw = new ConcreteComponentTextInput("name","test");
		ConcreteDecoratorLabeled cdl = new ConcreteDecoratorLabeled(cw, "姓名");
		System.out.println(cdl.paint());
		ConcreteDecoratorInvalid cdi = new ConcreteDecoratorInvalid(cdl,true);
		System.out.println(cdi.paint());
	}

}
