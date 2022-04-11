package com.cms.ds;

public class IntegerToRoman {

	// public static final int[] ARABIC_DIGITS = { 5, 4, 1 };
	// public static final String[] ROMAN_DIGITS = { "V", "IV", "I" };

	public static final int[] ARABIC_DIGITS = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	public static final String[] ROMAN_DIGITS = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
			"I" };

	public static void main(String[] args) {
		System.out.println(convertIntToRoman(24));
	}

	public static String convertIntToRoman(int number) {
		if (number <= 0) {
			throw new RuntimeException("Number should be positive.");
		}
		StringBuilder romanNumber = new StringBuilder();
		for (int index = 0; index < ARABIC_DIGITS.length; index++) {
			while (number >= ARABIC_DIGITS[index]) {
				romanNumber.append(ROMAN_DIGITS[index]);
				number = number - ARABIC_DIGITS[index];
			}
		}
		return romanNumber.toString();
	}
}
