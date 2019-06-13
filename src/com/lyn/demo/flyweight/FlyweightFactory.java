package com.lyn.demo.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lyn.demo.flyweight.impl.ConcreteFlyweight;
import com.lyn.demo.flyweight.impl.UnShareConcreteFlyweight;

public class FlyweightFactory {
	//缓存享元对象
	private  Map<String,Flyweight> map;

	private static FlyweightFactory flyweightFacotry;
	
	private FlyweightFactory() {
		this.map = new HashMap<String,Flyweight>();
	}
	
	/**
	 * 获得享元对象工厂 
	 */
	public static synchronized FlyweightFactory getInstance()
	{
		if(null==flyweightFacotry)
		{
			flyweightFacotry = new FlyweightFactory();
		}
		return flyweightFacotry;
	}
	
	public Flyweight getFlyweight(Object flyweight)
	{
		if(flyweight instanceof String)
		{
			String flyweightkey = flyweight.toString();
			if(!map.containsKey(flyweightkey))
			{
				map.put(flyweightkey, new ConcreteFlyweight("呵呵哒"));
			}
			return map.get(flyweightkey);
		}
		if(flyweight instanceof List<?>||flyweight instanceof String[])
		{
			UnShareConcreteFlyweight unShareConcreteFlyweight = new UnShareConcreteFlyweight();
			String[] keys =null;
			if(flyweight instanceof List<?>)
			{
				Class<? extends Object> clazz = ((List<?>) flyweight).get(0).getClass();
				if(clazz==String.class){
					List<String> arraykeys = (List<String>) flyweight;
					keys =new String[arraykeys.size()];
					arraykeys.toArray(keys);
				}
			}else{
				keys = (String[])flyweight;
			}
			for(String key :keys)
			{
				//递归调用获取享元对象
				unShareConcreteFlyweight.add(key, this.getFlyweight(key));
			}
			return unShareConcreteFlyweight;
		}
		return null;
	}
	

}
