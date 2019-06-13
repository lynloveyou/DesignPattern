package com.lyn.demo.bridge.impl;

import com.lyn.demo.bridge.BrushPenAbstraction;
import com.lyn.demo.bridge.ImplementColor;

public class BigBrushPenRefinedAbstraction extends BrushPenAbstraction {

	public BigBrushPenRefinedAbstraction(ImplementColor ic) {
		super(ic);
	}

	@Override
	public void operationDraw() {
		System.out.println(new StringBuilder("---user big brush pen---color:"));
		this.getIc().bepaint();
	}

}
