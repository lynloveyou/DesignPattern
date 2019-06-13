package com.lyn.demo.flyweight.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.lyn.demo.flyweight.Flyweight;

public class UnShareConcreteFlyweight  implements Flyweight {
	private Map<String,Flyweight> componentCache;

	public UnShareConcreteFlyweight() {
		this.componentCache = new HashMap<String,Flyweight>();
	}


	@Override
	public void operate(String extStatus) {
		Collection<Flyweight> values = this.componentCache.values();
		for(Flyweight flyweight:values)
		{
			flyweight.operate(extStatus);
		}
	}
	
	public void add(String flyweightkey,Flyweight flyweight)
	{
		componentCache.put(flyweightkey, flyweight);
	}

}
