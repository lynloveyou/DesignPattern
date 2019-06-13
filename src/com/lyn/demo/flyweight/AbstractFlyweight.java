package com.lyn.demo.flyweight;

public abstract class AbstractFlyweight implements Flyweight {
	private String innerstatus;

	public AbstractFlyweight(String innerstatus) {
		this.innerstatus = innerstatus;
	}

	public String getInnerstatus() {
		return innerstatus;
	}
	

}
