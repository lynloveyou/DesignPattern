package com.lyn.test;

import com.lyn.algorithms.BCrypt;

public class BCryptDemo {

	public static void main(String[] args) {
		String hashpw = BCrypt.hashpw("123", BCrypt.gensalt(12));
		System.out.println(hashpw);
		hashpw = BCrypt.hashpw("123", BCrypt.gensalt(12));
		System.out.println(hashpw);
		boolean checkpw = BCrypt.checkpw("123", hashpw);
		System.out.println(checkpw);
	}

}
