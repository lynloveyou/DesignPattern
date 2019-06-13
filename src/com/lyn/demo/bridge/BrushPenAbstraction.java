package com.lyn.demo.bridge;

public abstract class BrushPenAbstraction {

	private ImplementColor ic;

	public BrushPenAbstraction(ImplementColor ic) {
		super();
		this.ic = ic;
	}

	public void setIc(ImplementColor ic) {
		this.ic = ic;
	}
	
	public ImplementColor getIc() {
		return ic;
	}

	public abstract void operationDraw();

}
