package com.cms.ds;

public class LongestCommonPrefixMain {

	public static void main(String[] args) {
		String[] stringsArray = { "java2blog", "javaworld", "javabean", "javatemp" };
		String longestPrefix = getLongestCommonPrefix(stringsArray);
		System.out.println("Longest Prefix : " + longestPrefix);
	}

	private static String getLongestCommonPrefix(String[] strArr) {

		String minLengthString = findMinLengthString(strArr);
		int minLength = minLengthString.length();
		for (int index = 0; index < strArr.length; index++) {
			for (int stringCharIndex = 0; stringCharIndex < minLength; stringCharIndex++) {
				if (minLengthString.charAt(stringCharIndex) != strArr[index].charAt(stringCharIndex)) {
					if (stringCharIndex < minLength) {
						minLength = stringCharIndex;
					}
					break;
				}
			}
		}
		return minLengthString.substring(0, minLength);
	}

	private static String findMinLengthString(String[] stringsArray) {
		String minLengthString = stringsArray[0];
		for (int index = 1; index < stringsArray.length; index++) {
			if (minLengthString.length() > stringsArray[index].length()) {
				minLengthString = stringsArray[index];
			}
		}
		return minLengthString;
	}

}
