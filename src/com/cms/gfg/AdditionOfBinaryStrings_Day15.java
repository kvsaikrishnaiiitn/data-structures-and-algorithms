package com.cms.gfg;

import java.util.Arrays;

public class AdditionOfBinaryStrings_Day15 {
	public static void main(String[] args) {
		String s1 = "11";
		String s2 = "1";

		s1.trim();
		s2.trim();

		// Trim leading zero's
		s1 = trimLeadingZerosFromBinaryString(s1);
		s2 = trimLeadingZerosFromBinaryString(s2);

		if (s1.length() < s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		int n = s1.length();
		int m = s2.length();

		int[] s1Chars = Arrays.stream(s1.split("")).mapToInt(Integer::parseInt).toArray();
		int[] s2Chars = Arrays.stream(s1.split("")).mapToInt(Integer::parseInt).toArray();

		StringBuilder result = new StringBuilder();
		int carry = 0;

		int bit1 = 0;
		int bit2 = 0;
		int j = m - 1;

		for (int i = n - 1; i >= 0; i--) {
			bit1 = s1Chars[i];
			int bitSum = bit1 + carry;
			if (j >= 0) {
				bit2 = s2Chars[j];
				bitSum += bit2;
				j--;
			}
			int bit = bitSum % 2;
			carry = bitSum / 2;
			result.append(bit);
		}

		if (carry > 0) {
			result.append(1);
		}
		System.out.println("result:" + result.reverse());
	}

	private static String trimLeadingZerosFromBinaryString(String s1) {
		char[] chars = s1.toCharArray();
		StringBuilder trimmedString = new StringBuilder();
		int index = 0;
		while (chars[index] == '0') {
			index++;
		}
		while (index < chars.length) {
			trimmedString.append(chars[index]);
			index++;
		}
		return trimmedString.toString();
	}
}
