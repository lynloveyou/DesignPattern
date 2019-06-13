package com.lyn.thinkjava.three;

public class ToBinaryStringDemo {

	public static void main(String[] args) {
		long k = 01545L;
		long i = 0X12fL;
		System.out.println(Long.toBinaryString(k));
		System.out.println(Long.toBinaryString(i));
		System.out.println(Math.pow(2, 8));
		System.out.println("==============移位操作符(正数)========");
		int change = 4;
		System.out.println(Integer.toBinaryString(change));
		System.out.println(Integer.toBinaryString(change>>1));
		System.out.println(Integer.toBinaryString(change>>2));
		System.out.println(Integer.toBinaryString(change>>3));
		System.out.println(Integer.toBinaryString(change<<2));
		System.out.println("==============操作符(负数)========");
		int change2 = -4;
		System.out.println(Integer.toBinaryString(change2));
		System.out.println(Integer.toBinaryString(change2<<2));
		System.out.println(change2<<2);
		System.out.println(Integer.toBinaryString(change2>>2));
		System.out.println(change2>>2);
		System.out.println(Integer.toBinaryString(change2>>>1));
		System.out.println(change2>>>1);
		change2>>>=1;
		System.out.println(change2);
		System.out.println("==============INT MAX AND MIN========");
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println(1+2+3+"+");
		boolean ba=false;
		boolean bb=true;
		//赋值操作，赋值后的结果是boolean类型
		if(ba=bb)
		{
		}
		//错误是因为赋值操作不是得到boolean类型
		//if(true=true){}
		//位运算符
		System.out.println(true&true);
		System.out.println(true|false);
		System.out.println(false^false);
		System.out.println(true^true);
		System.out.println(false^true);
		System.out.println("=============cast float/double to int==========");
		double above = 0.7D,below=0.4D;
		float fabove = 0.7F,fbelow=0.4F;
		System.out.println("(int)above:"+(int)above);
		System.out.println("(int)below:"+(int)below);
		System.out.println("(int)fabove:"+(int)fabove);
		System.out.println("(int)fbelow:"+(int)fbelow);
	}

}
