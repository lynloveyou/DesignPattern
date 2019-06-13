package com.lyn.demo.composite;

public class ItemLeaf implements MenuComponent {
	private MenuComponent parentMenuComponent;
	private String name;
	private String url;
	
	@Override
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(String componentName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public MenuComponent getComponent(String componentName) {
		throw new UnsupportedOperationException();
	}

	@Override
	public MenuComponent getParent() {
		return this.parentMenuComponent;
	}
	
	@Override
	public void setParent(MenuComponent component) {
		this.parentMenuComponent = component;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getUrl() {
		return this.url;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public ItemLeaf(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public void displayOperation(int initwhite) {
		System.out.println("|__"+this.getName()+"=>"+this.getUrl());
	}

}
