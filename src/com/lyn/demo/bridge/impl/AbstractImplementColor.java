package com.lyn.demo.bridge.impl;

import com.lyn.demo.bridge.ImplementColor;

public abstract class AbstractImplementColor implements ImplementColor {
	private String colorName;

	public AbstractImplementColor(String colorName) {
		super();
		this.colorName = colorName;
	}

	public AbstractImplementColor() {
	}

	@Override
	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getColorName() {
		return colorName;
	}

	@Override
	public void bepaint() {
		System.out.println(colorName);
	}
}
