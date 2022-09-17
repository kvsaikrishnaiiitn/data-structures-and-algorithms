package com.cms.ds;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {

		int[] digits = { 0 };

		int number = convertArrayToNumber(digits);
		number = number + 1;

		convertNumberToArray(number);

		System.out.println(Arrays.toString(convertNumberToArray(number)));

	}

	static int convertArrayToNumber(int[] digits) {
		if (digits == null || digits.length == 0) {
			return 0;
		}

		int number = 0;
		for (int eachDigit : digits) {
			number = number * 10 + eachDigit;
		}
		return number;
	}

	static int[] convertNumberToArray(int number) {
		String numberString = String.valueOf(number);
		int[] nums = new int[numberString.length()];
		for (int index = 0; index < nums.length; index++) {
			nums[index] = Integer.valueOf(numberString.substring(index, index + 1));
		}
		return nums;
	}

}
