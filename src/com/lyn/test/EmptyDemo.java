package com.lyn.test;

import java.math.BigDecimal;

public class EmptyDemo {

	public static void main(String[] args) {
		String str="";
		System.out.println(str.length());
		 str="    ";
		System.out.println(str.length());
		BigDecimal total = new BigDecimal(1223333);
		System.out.println(total.toString());
		System.out.println(0/100);
	}

}
