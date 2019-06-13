package com.lyn.demo.iterator;

/**
 * 定义抽象聚合类包含获取迭代器接口
 * 
 */
public interface Aggregate<E> {
	
	/**
	 * 获得数据遍历器
	 */
	public Iterator<E> getIterator();

}
