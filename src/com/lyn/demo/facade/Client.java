package com.lyn.demo.facade;

public class Client {

	/**
	 *  适用性
        1) 当你要为一个复杂子系统提供一个简单接口时。子系统往往因为不断演化而变得越来越复杂。大多数模式使用时都会产生更多更小的类。
    		这使得子系统更具可重用性，也更容易对子系统进行定制，但这也给那些不需要定制子系统的用户带来一些使用上的困难。facade可以提供一个简单的缺省视图，
    		这一视图对大多数用户来说已经足够，而那些需要更多的可定制性的用户可以越过facade层。
    	2) 客户程序与抽象类的实现部分之间存在着很大的依赖性。引入 facade将这个子系统与客户以及其他的子系统分离，可以提高子系统的独立性 和可移植性。
    	3) 当你需要构建一个层次结构的子系统时，使用 facade模式定义子系统中每层的入口点。如果子系统之间是相互依赖的，你可以让它们仅通过facade进行通讯，从而简化了它们之间的依赖关系。
	 * 
	 * 构建模式的组成
		外观角色（Facade）：是模式的核心，他被客户client角色调用，知道各个子系统的功能。同时根据客户角色已有的需求预订了几种功能组合\
		子系统角色（Subsystem classes）：实现子系统的功能，并处理由Facade对象指派的任务。对子系统而言，facade和client角色是未知的，没有Facade的任何相关信息；即没有指向Facade的实例。
		客户角色（client）：调用facade角色获得完成相应的功能。
	 * 
	 */
	public static void main(String[] args) {
		SwitchFacade sf =ConcreteSwitchFacade.getInstance();
		System.out.println("================day on=========");
		sf.machineTakeOnDay(SwitchFacade.MACHINE_ON);
		System.out.println("=================day off=========");
		sf.machineTakeOnDay(SwitchFacade.MACHINE_OFF);
		System.out.println("==================night on========");
		sf.machineTakeOnNight(SwitchFacade.MACHINE_ON);
		System.out.println("==================night off========");
		sf.machineTakeOnNight(SwitchFacade.MACHINE_OFF);
	}

}
