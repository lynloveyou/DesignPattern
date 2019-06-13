package com.lyn.demo.composite;

public interface MenuComponent {
	
	//增加节点
	public void add(MenuComponent component);
	
	//删除节点
	public boolean remove(String componentName);
	
	//获取节点
	public MenuComponent getComponent(String componentName);
	
	//获取父节点
	public MenuComponent getParent();
	
	//设置父节点
	public void setParent(MenuComponent component);
	
	//获取名称
	public String getName();
	
	//获取地址
	public String getUrl();
	
	//显示该节点内容
	public void displayOperation(int initwhite);
	
}
