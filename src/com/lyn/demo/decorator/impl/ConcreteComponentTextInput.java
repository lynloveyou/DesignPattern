package com.lyn.demo.decorator.impl;

import com.lyn.demo.decorator.ComponentWidget;

public class ConcreteComponentTextInput implements ComponentWidget {
	private String name;
	private String value;

	public ConcreteComponentTextInput(String name, String value) {
		this.name = name;
		this.value = value;
	}

	//打印INPUTHTML
	@Override
	public String paint() {
		return "<input type='text' name='"+this.name+"' value='"+this.value+"'>";
	}

}
