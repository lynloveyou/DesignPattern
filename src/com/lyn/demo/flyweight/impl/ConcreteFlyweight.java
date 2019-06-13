package com.lyn.demo.flyweight.impl;

import com.lyn.demo.flyweight.AbstractFlyweight;
import com.lyn.demo.flyweight.Flyweight;

public class ConcreteFlyweight extends AbstractFlyweight implements Flyweight {
	private String extStatus;
	
	public ConcreteFlyweight(String innerstatus) {
		super(innerstatus);
	}

	@Override
	public void operate(String extStatus) {
		this.extStatus = extStatus;
		System.out.println("----inner-status--"+getInnerstatus()+"----out-status---"+this.extStatus);
	}
	
}
