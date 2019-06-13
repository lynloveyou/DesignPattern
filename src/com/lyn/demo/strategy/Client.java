package com.lyn.demo.strategy;

import com.lyn.demo.strategy.service.impl.AirplaneStrategy;
import com.lyn.demo.strategy.service.impl.TrainStrategy;

public class Client {
	/**
	 * 适用性
	 *	当存在以下情况时使用Strategy模式
	 *	1）• 许多相关的类仅仅是行为有异。 “策略”提供了一种用多个行为中的一个行为来配置一个类的方法。即一个系统需要动态地在几种算法中选择一种。
	 *	2）• 需要使用一个算法的不同变体。例如，你可能会定义一些反映不同的空间 /时间权衡的算法。当这些变体实现为一个算法的类层次时 ,可以使用策略模式。
	 *	3）• 算法使用客户不应该知道的数据。可使用策略模式以避免暴露复杂的、与算法相关的数据结构。
	 *	4）• 一个类定义了多种行为 , 并且这些行为在这个类的操作中以多个条件语句的形式出现。将相关的条件分支移入它们各自的Strategy类中以代替这些条件语句。
	 * 
	 * 模式的组成
	 *	环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
	 *	抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
	 *	具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
	 * 
	 */
	public static void main(String[] args) {
		// 乘飞机出行
		PersonContext pc = new PersonContext(new AirplaneStrategy());
		pc.travel();
		// 改换火车旅行
		pc.setTravelStrategy(new TrainStrategy());
		pc.travel();
		System.out.println("---------分割-----");
		//通过模式进行旅行
		pc.travel(PersonContext.STRATEGY_TRAIN+PersonContext.STRATEGY_BICYCLE);
		System.out.println("---------分割-----");
		//通过模式进行旅行
		pc.travel(PersonContext.STRATEGY_BICYCLE);
	}

}
