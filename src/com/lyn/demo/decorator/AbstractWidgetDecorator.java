package com.lyn.demo.decorator;

public abstract class AbstractWidgetDecorator implements WidgetDecorator {
	private ComponentWidget cw;
	
	public AbstractWidgetDecorator(ComponentWidget cw) {
		this.cw = cw;
	}

	@Override
	public String paint() {
		return cw.paint();
	}
	
	
}
