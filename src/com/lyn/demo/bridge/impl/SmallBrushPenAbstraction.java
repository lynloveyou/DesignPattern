package com.lyn.demo.bridge.impl;

import com.lyn.demo.bridge.BrushPenAbstraction;
import com.lyn.demo.bridge.ImplementColor;

public class SmallBrushPenAbstraction extends BrushPenAbstraction {

	public SmallBrushPenAbstraction(ImplementColor ic) {
		super(ic);
	}

	@Override
	public void operationDraw() {
		System.out.println(new StringBuilder("---user small brush pen---color:"));
		this.getIc().bepaint();
	}

}
