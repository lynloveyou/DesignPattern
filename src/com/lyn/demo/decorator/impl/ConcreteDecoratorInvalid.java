package com.lyn.demo.decorator.impl;

import com.lyn.demo.decorator.AbstractWidgetDecorator;
import com.lyn.demo.decorator.ComponentWidget;

public class ConcreteDecoratorInvalid extends AbstractWidgetDecorator {
	private boolean invalidate;
	
	public ConcreteDecoratorInvalid(ComponentWidget cw, boolean invalidate) {
		super(cw);
		this.invalidate = invalidate;
	}

	@Override
	public String paint() {
		return "<span  class='invalid'>"+invalidate+"</span>"+super.paint();
	}

}
