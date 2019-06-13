package com.lyn.demo.adapter;

import com.lyn.demo.adapter.interfaze.AdapteeInterface;

public class AdapaterObject implements Target{
	//受改着
	private AdapteeInterface adaptee;
	
	public AdapaterObject(AdapteeInterface adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void hello() {
		adaptee.greet();	
	}

	@Override
	public void world() {
		adaptee.world();
	}
}
