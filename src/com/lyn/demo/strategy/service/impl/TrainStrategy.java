package com.lyn.demo.strategy.service.impl;

import com.lyn.demo.strategy.service.TravelStrategy;

public class TrainStrategy implements TravelStrategy {

	@Override
	public void travel() {
		System.out.println("-----使用火车进行进行旅行---------");
	}

}
