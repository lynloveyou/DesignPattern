package com.lyn.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class NumberTest {

		public static void main(String[] args) {
			BigDecimal d1 = new BigDecimal(0.01123);
			DecimalFormat df =new  DecimalFormat("####0.00");
			System.out.println(df.format(d1));
			df =new  DecimalFormat("####0.#");
			System.out.println(df.format(d1));
		}
}
