package com.cms.ds;

import java.util.Arrays;

public class CheckTwoStringAnagramsOrNot {

	public static void main(String[] args) {

		String first = "Army";
		String second = "Mary";

		findAnagramsOrNot(first, second);

	}

	public static void findAnagramsOrNot(String first, String second) {
		first = first.toLowerCase();
		second = second.toLowerCase();

		char[] firstChars = first.toCharArray();
		char[] secondChars = second.toCharArray();

		Arrays.sort(firstChars);
		Arrays.sort(secondChars);

		System.out.println(Arrays.equals(firstChars, secondChars));

	}

}
