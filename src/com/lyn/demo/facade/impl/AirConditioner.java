package com.lyn.demo.facade.impl;

import com.lyn.demo.facade.Machine;

public class AirConditioner implements Machine {

	@Override
	public void takeOn() {
		System.out.println("AirConditioner is take on \r");
	}

	@Override
	public void takeOff() {
		System.out.println("AirConditioner is take off \r");
	}

}
