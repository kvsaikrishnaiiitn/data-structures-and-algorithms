package com.cms.ds;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(123890));
	}

	public static int reverseNumber(int number) {
		//System.out.println(number);
		long reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
			if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE) {
				throw new RuntimeException("Can't find reverse as it's value is either max or min of Integer range");
			}
		}
		return (int) reverseNumber;
	}

}
