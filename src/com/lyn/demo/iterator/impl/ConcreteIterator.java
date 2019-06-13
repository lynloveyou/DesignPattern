package com.lyn.demo.iterator.impl;

import com.lyn.demo.iterator.Iterator;

/**
 * 具体遍历器
 */
public class ConcreteIterator implements Iterator<Integer> {
	private int position;
	private Integer[] elements;
	private int size;
	
	public ConcreteIterator(Integer[] elements) {
		this.elements = elements;
		size = elements.length;
		position = -1;
	}

	@Override
	public void rewind() {
		this.position=-1;
	}

	@Override
	public Integer next() {
		position++;
		return elements[position];
	}

	@Override
	public Integer current() {
		return elements[position];
	}

	@Override
	public boolean hasNext() {
		return position+1<size;
	}
	

}
