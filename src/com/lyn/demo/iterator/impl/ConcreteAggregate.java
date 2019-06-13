package com.lyn.demo.iterator.impl;

import com.lyn.demo.iterator.Aggregate;
import com.lyn.demo.iterator.Iterator;

//具体聚合类
public class ConcreteAggregate implements Aggregate<Integer> {
	private Integer[] elements;
	public ConcreteAggregate(Integer[] elements)
	{
		this.elements = elements;
	}
	
	@Override
	public Iterator<Integer> getIterator() {
		return new ConcreteIterator(elements);
	}

}
