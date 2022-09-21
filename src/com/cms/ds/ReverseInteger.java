package com.cms.ds;

public class ReverseInteger {

	public static void main(String[] args) {

		int x = 123;
		System.out.println(x);
		System.out.println(reverseInteger(x));
		
	}

	private static int reverseInteger(int x) {

		int reverseNumber = 0;
		if (x >= 0 && x < 10) {
			return x;
		}

		while (x > 0) {
			int lastDigit = x % 10;
			x = x / 10;
			reverseNumber = reverseNumber * 10 + lastDigit;
		}

		return reverseNumber;
	}
}
