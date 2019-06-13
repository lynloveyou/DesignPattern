package com.lyn.test;

public class Children extends Parent{

	public Children() {
		this("123");
		System.out.println("---------second-load-children--class--");
	}
	
	public Children(String s)
	{
		//super();
		//super(s);
		System.out.println("-------------s------:"+s);
	}
	
	public static void main(String[] args) 
	{
		new Children("123");
	}
}
