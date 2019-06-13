package com.lyn.demo.adapter.interfaze;

public class AdapteeImpl implements AdapteeInterface {

	@Override
	public void greet() {
		System.out.println("interface-hello");
	}

	@Override
	public void world() {
		System.out.println("interface-world!");
	}

}
