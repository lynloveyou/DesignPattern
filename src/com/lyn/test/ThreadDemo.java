package com.lyn.test;

public class ThreadDemo {
	
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("123");
			}
		});
		thread.start();
	}

}
