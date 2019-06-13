package com.lyn.test;

public class RecursiveTest {
	
	public static void recur(int recur,int startSize)
	{
		int temp = startSize++;
		if(temp<recur)
		{
			recur(recur, startSize);	
		}
		System.out.println("--out-"+temp);
	}
	public static void main(String[] args)
	{
		recur(8, 1);
	    System.out.println(System.getProperty("file.encoding"));
	}
}
