package com.lyn.demo.decorator.impl;

import com.lyn.demo.decorator.AbstractWidgetDecorator;
import com.lyn.demo.decorator.ComponentWidget;

/**
 * 增加label标签
 * @author Administrator
 *
 */
public class ConcreteDecoratorLabeled extends AbstractWidgetDecorator {
	private String label;	
	
	public ConcreteDecoratorLabeled(ComponentWidget cw, String label) {
		super(cw);
		this.label = label;
	}

	@Override
	public String paint() {
		return "<label>"+this.label+"</label>"+super.paint();
	}

}
