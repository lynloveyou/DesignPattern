package com.lyn.demo.strategy.service.impl;

import com.lyn.demo.strategy.service.TravelStrategy;

public class BicycleStrategy implements TravelStrategy {

	@Override
	public void travel() {
		System.out.println("-----使用单车进行旅行-------------");
	}

}
