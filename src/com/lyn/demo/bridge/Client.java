package com.lyn.demo.bridge;

import com.lyn.demo.bridge.impl.BigBrushPenRefinedAbstraction;
import com.lyn.demo.bridge.impl.BlueImplementColor;
import com.lyn.demo.bridge.impl.RedImplementColor;
import com.lyn.demo.bridge.impl.SmallBrushPenAbstraction;

public class Client {
	/**
	 * 
	 *  适用性
	 *  1）. 你不希望在抽象和他的实现部分之间有一个固定的邦定关系，如在程序的运行时刻实现部分应该可以被选择或者切换。
		2）. 类的抽象以及他的视像都可以通过生成子类的方法加以扩充。这时bridge模式使你可以对不同的抽象接口
      	和实现部分进行组合，并对他们进行扩充。
		3）. 对一个抽象的实现部分的修改应该对客户不产生影响，即客户的代码不需要重新编译。
		4）. 你想对客户完全隐藏抽象的实现部分。
		5）. 你想在多个实现间 共享实现，但同时要求客户并不知道这一点。
	 * 
	 * 构建模式的组成
		1）抽象类(Abstraction):定义抽象类的接口,维护一个指向Implementor类型对象的指针
		2）扩充抽象类(RefinedAbstraction)：扩充由Abstraction定义的接口
		3）实现类接口(Implementor)：定义实现类的接口，该接口不一定要与 Abstraction的接口完全一致；事实上这两个接口可以完全不同。
		  一般来讲， Implementor接口仅提供基本操作，而 Abstraction则定义了基于这些基本操作的较高层次的操作。
		4）具体实现类(ConcreteImplementor)：实现Implementor接口并定义它的具体实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BrushPenAbstraction bigpa = new BigBrushPenRefinedAbstraction(new BlueImplementColor());
		bigpa.operationDraw();
		bigpa = new BigBrushPenRefinedAbstraction(new RedImplementColor());
		bigpa.operationDraw();
		BrushPenAbstraction smallpa = new SmallBrushPenAbstraction(new BlueImplementColor());
		smallpa.operationDraw();
		smallpa = new SmallBrushPenAbstraction(new RedImplementColor());
		smallpa.operationDraw();
	}

}
