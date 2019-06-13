package com.lyn.demo.prototype;

public class DeepClone implements Cloneable {

	@Override
	protected DeepClone clone() throws CloneNotSupportedException {
		return (DeepClone)super.clone();
	}
	
	
}
