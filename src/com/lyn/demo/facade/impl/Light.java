package com.lyn.demo.facade.impl;

import com.lyn.demo.facade.Machine;

public class Light implements Machine {

	@Override
	public void takeOn() {
		System.out.println("Light is take on\r");
		
	}

	@Override
	public void takeOff() {
		System.out.println("Light is take off\r");		
	}

	
}
