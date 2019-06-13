package com.lyn.demo.strategy.service.impl;

import com.lyn.demo.strategy.service.TravelStrategy;

public class AirplaneStrategy implements TravelStrategy{

	@Override
	public void travel() {
		System.out.println("-----使用飞机进行旅行---------");
	}
}
