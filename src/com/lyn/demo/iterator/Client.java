package com.lyn.demo.iterator;

import com.lyn.demo.iterator.impl.ConcreteAggregate;

public class Client {
	
	/**
	 * 适用性
	 *	• 访问一个聚合对象的内容而无需暴露它的内部表示。
	 *	• 需要为聚合对象提供多种遍历方式。
	 *	• 为遍历不同的聚合结构提供一个统一的接口 (即, 支持多态迭代)
	 *
	 *
	 * 模式的组成
	 *	抽象迭代器(Iterator): 迭代器定义访问和遍历元素的接口。
	 *	具体迭代器(ConcreteIterator):  具体迭代器实现迭代器Iterator接口。对该聚合遍历时跟踪当前位置。
	 *	抽象聚合类(Aggregate): 聚合定义创建相应迭代器对象的接口。
	 *	具体聚合类(ConcreteAggregate): 体聚合实现创建相应迭代器的接口，该操作返回ConcreteIterator的一个适当的实例。
	 */
	
	public static void main(String[] args) {
		Integer[] key = {1,2,3,4,5};
		Aggregate<Integer> aggregate = new ConcreteAggregate(key);
		Iterator<Integer> iterator = aggregate.getIterator();
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println(next);
		}
		System.out.println("===========rewind==========");
		iterator.rewind();
		while(iterator.hasNext())
		{
			Integer next = iterator.next();
			System.out.println(next);
		}
	}

}
