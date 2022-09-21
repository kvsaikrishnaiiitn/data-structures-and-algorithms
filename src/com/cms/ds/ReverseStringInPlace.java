package com.cms.ds;

import java.util.Arrays;

public class ReverseStringInPlace {

	public static void main(String[] args) {

		char[] s = { 'a', 'b', 'c', 'd' };
		System.out.println(Arrays.toString(s));
		reverseString(s);
		System.out.println(Arrays.toString(s));
	}

	private static void reverseString(char[] s) {
		if (s == null || s.length == 0 || s.length == 1) {
			return;
		}
		int n = s.length;
		for (int index = 0; index < n / 2; index++) {
			char tempChar = s[index];
			s[index] = s[n - 1 - index];
			s[n - 1 - index] = tempChar;
		}
	}
}
