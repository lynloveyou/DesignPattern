package com.lyn.demo.adapter;

import com.lyn.demo.adapter.interfaze.AdapteeImpl;

public class Client {

	
	/**
	 * 
	 * 适用性
	 * 以下情况使用Adapter模式：
	   • 你想使用一个已经存在的类，而它的接口不符合你的需求。
	   • 你想创建一个可以复用的类，该类可以与其他不相关的类或不可预见的类（即那些接口可能不一定兼容的类）协同工作。
	   •（仅适用于对象Adapter）你想使用一些已经存在的子类，但是不可能对每一个都进行子类化以匹配它们的接口。对象适配器可以适配它的父类接口。即仅仅引入一个对象，并不需要额外的指针以间接取得adaptee。
	 * 
	 * 构建模式的组成
	 * •目标角色（Target）：— 定义Client使用的与特定领域相关的接口。
	   • 客户角色（Client）：与符合Target接口的对象协同。
	   • 被适配橘色（Adaptee)：定义一个已经存在并已经使用的接口，这个接口需要适配。
       • 适配器角色（Adapte) ：适配器模式的核心。它将对被适配Adaptee角色已有的接口转换为目标角色Target匹配的接口。对Adaptee的接口与Target接口进行适配.
	 */
	public static void main(String[] args) {
		//类适配器
		Target target = new AdapterClazz();
		target.hello();
		target.world();
		//对象适配器
		target = new AdapaterObject(new AdapteeImpl());
		target.hello();
		target.world();
	}

}
