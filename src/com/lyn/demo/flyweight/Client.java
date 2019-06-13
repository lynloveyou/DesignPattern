package com.lyn.demo.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * 适用性
	1）一个应用程序使用大量相同或者相似的对象，造成很大的存储开销。
	2）对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
	3）如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象。
	4） 应用程序不依赖于对象标识。由于Flyweight对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值。
	5）使用享元模式需要维护一个存储享元对象的享元池，而这需要耗费资源，因此，应当在多次重复使用享元对象时才值得使用享元模式
 * 
 * 构建模式的组成
 * 1) 抽象享元类(Flyweight):
 *		描述一个接口，通过这个接口flyweight可以接受并作用于外部状态。
 *	2) 具体享元类(ConcreteFlyweight):
 *		实现Flyweight接口 ，并为内部状态（ 如果有的话 )增加存储空间。ConcreteFlyweight对象必须是可共享的。
 *		它所存储的状态必须是内部的；即，它必须独立于ConcreteFlyweight对象的场景。
 *	3) 非共享具体享元类(UnsharedConcreteFlyweight)：
 *		并非所有的Flyweight子类都需要被共享。Flyweight接口使共享成为可能，但它并不强制共享。在Flyweight对象结构的某些层次，
 *		UnsharedConcreteFlyweight对象通常将ConcreteFlyweight对象作为子节点。
 *	4) 享元工厂类(FlyweightFactory):
 *		创建并管理flyweight对象, 确保合理地共享flyweight。本角色必须保证享元对象可以被系统适当地共享。当一个客户端对象调用一个享元对象
 *	    flyweight的时候，享元工厂角色（Flyweight Factory对象）会检查系统中是否已经有一个符合要求的享元对象。
 *	   	如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，享元工厂角色就应当创建一个合适的享元对象。
 *	5) 客户（Client）:维持一个对flyweight的引用。计算或存储一个（多个）flyweight的外部状态
 *
 */
public class Client {

	public static void main(String[] args) {
		FlyweightFactory factory = FlyweightFactory.getInstance();
		//享元对象
		Flyweight flyweight = factory.getFlyweight("status a");
		flyweight.operate("other status a");
		flyweight = factory.getFlyweight("status b");
		flyweight.operate("other status b");
		//不共享对象
		List<String> ids = new ArrayList<String>();
		ids.add("123");ids.add("456");
		flyweight = factory.getFlyweight(ids);
		flyweight.operate("other public status XXX");
		String keys[] =new String[2];
		keys[0]="789";keys[1]="852";
		flyweight = factory.getFlyweight(keys);
		flyweight.operate("other public status YYY");
	}

}
