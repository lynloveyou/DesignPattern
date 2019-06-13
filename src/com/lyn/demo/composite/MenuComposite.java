package com.lyn.demo.composite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MenuComposite implements MenuComponent {
	private MenuComponent parentMenuComponent;
	private String name;
	private String url;
	private Map<String,MenuComponent> items;
	
	@Override
	public void add(MenuComponent component) {
		if(items.containsKey(component.getName()))
		{
			throw new RuntimeException("相同目录下名称不能重叠");
		}
		items.put(component.getName(), component);
	}

	@Override
	public boolean remove(String componentName) {
		return items.remove(componentName)!=null;
	}

	@Override
	public MenuComponent getComponent(String componentName) {
		return items.get(componentName);
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
	
	public Map<String,MenuComponent> getItems()
	{
		return this.items;
	}
	public MenuComposite(String name, String url) {
		this.name = name;
		this.url = url;
		items = new HashMap<String,MenuComponent>();
	}

	@Override
	public void displayOperation(int initwhite) {
		String align = "|__";
		int spaceWhite=0;
		if(this.items.size()>0)
		{
			spaceWhite = align.length()+this.getName().length();
		}
		spaceWhite = initwhite+spaceWhite;
		System.out.println(align+this.getName());
		Set<Entry<String, MenuComponent>> entrySet = this.items.entrySet();
		for(Entry<String, MenuComponent> entity:entrySet)
		{
			char[] whitespace = new char[spaceWhite];
			Arrays.fill(whitespace,' ');
			System.out.print(new String(whitespace));
			entity.getValue().displayOperation(spaceWhite);
		}
	}

}
