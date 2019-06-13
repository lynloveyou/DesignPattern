package com.lyn.demo.iterator;
/**
 * 定义迭代器接口
 */
public interface Iterator<E> {

	/**
	 * 重新开始遍历
	 */
	public void rewind();
	
	/**
	 * 下一个数据
	 */
	public E next();
	
	/**
	 * 是否有下一个数据
	 */
	public boolean hasNext();
	
	
	/**
	 * 当前数据
	 */
	public E current();
}
