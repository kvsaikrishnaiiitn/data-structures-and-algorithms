package com.cms.ds;

public class ReverseOfStringUsingRecursion {

	public static void main(String[] args) {

		String string = "Java";
		String[] array = string.split("");
		for (String s : array) {
			System.out.println(s);
		}
		System.out.println(array);
		// System.out.println(reverseString(string));

	}

	public static String reverseString(String string) {
		if (string.length() == 1) {
			return string;
		}
		return string.charAt(string.length() - 1) + reverseString(string.substring(0, string.length() - 1));
	}

}
