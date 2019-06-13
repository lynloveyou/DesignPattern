package com.lyn.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *动态扩展逻辑
 * 
 */
public class WeatherDynamicInvocationHandler implements InvocationHandler {
	private Weather weather;
	
	public WeatherDynamicInvocationHandler(Weather weather) {
		this.weather = weather;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String id = args[0].toString();
		System.out.println(id+" proxy invoke method before do ,method="+method.getName());
		if(_checkOAuth(id)){
			Object result = method.invoke(this.weather, args);
			System.out.println(id+" proxy invoke method after do ,method="+method.getName());
			return result;
		}
		return null;
	}
	
	private boolean _checkOAuth(String id)
	{
		if("employee".equals(id))
		{
			System.out.println("您没有相应的权限");
			return false;
		}
		return true;
	}

}
