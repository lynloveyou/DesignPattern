package com.lyn.demo.facade.impl;

import com.lyn.demo.facade.Machine;

public class WIFIConditioner implements Machine {

	@Override
	public void takeOn() {
		System.out.println("WIFIConditioner is take on\r");

	}

	@Override
	public void takeOff() {
		System.out.println("WIFIConditioner is take off\r");
	}

}
