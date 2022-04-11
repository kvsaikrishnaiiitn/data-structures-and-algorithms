package com.cms.ds;

public class ReverseString {

	public static void main(String[] args) {

		String str = "I love Swty and Java";

		System.out.println(reverseStringUsingStringBuilder(str));
		System.out.println(reverseStringManuallyUsingStringBuilder(str));
		System.out.println(reverseStringManuallyWithoutUsingStringBuilder(str));

	}

	public static String reverseStringUsingStringBuilder(String str) {
		StringBuilder stringBuilder = new StringBuilder(str);
		return stringBuilder.reverse().toString();
	}

	public static String reverseStringManuallyUsingStringBuilder(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int index = str.length() - 1; index >= 0; index--) {
			stringBuilder.append(str.charAt(index));
		}
		return stringBuilder.toString();
	}

	// Lot of overhead
	public static String reverseStringManuallyWithoutUsingStringBuilder(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

}
