package com.lyn.demo.proxy;

import java.util.HashMap;
import java.util.Map;

import com.lyn.demo.proxy.impl.ConcreteWeather;

public class WeatherProxy implements Weather{
	private Map<String,Weather> weather=new HashMap<String,Weather>();
	
	private Weather _getWeather(String id)
	{
		//检查权限
		if(_checkOAuth(id)){
			Weather idweather = weather.get(id);
			//控制是否可以获取相应对象
			if(!(idweather instanceof ConcreteWeather))
			{
				idweather = new ConcreteWeather();
				weather.put(id, idweather);
			}
		}
		return weather.get(id);
	}
	
	
	@Override
	public void request(String id,String city) {
		Weather idweather = _getWeather(id);
		if(idweather!=null)
		{
			idweather.request(id, city);
		}
	}

	@Override
	public void display(String id,String city) {
		Weather idweather = _getWeather(id);
		if(idweather!=null)
		{
			idweather.display(id, city);
		}
	}

	@Override
	public boolean isValidCity(String id,String city) {
		Weather idweather = _getWeather(id);
		if(idweather!=null)
		{
			return idweather.isValidCity(id, city);
		}
		return false;
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
