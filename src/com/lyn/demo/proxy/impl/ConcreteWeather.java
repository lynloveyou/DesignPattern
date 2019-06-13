package com.lyn.demo.proxy.impl;

import com.lyn.demo.proxy.Weather;

/** 
 * 真实主题角色(RealSubject): 
 * 
 */  
public class ConcreteWeather implements Weather {

	@Override
	public void request(String id,String city) {
		System.out.println(id+" request http weather API for "+city);
	}

	@Override
	public void display(String id,String city) {
		System.out.println(id+" you in "+city+" the weather is sun 20°c");
	}

	@Override
	public boolean isValidCity(String id,String city) {
		return true;
	}

}
