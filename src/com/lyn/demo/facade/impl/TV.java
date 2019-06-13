package com.lyn.demo.facade.impl;

import com.lyn.demo.facade.Machine;

public class TV implements Machine {

	@Override
	public void takeOn() {
		System.out.println("TV is take on\r");

	}

	@Override
	public void takeOff() {
		System.out.println("TV is take off\r");
	}

}
