package com.cms.ds;

import java.util.Stack;

public class CheckPalindromOrNotUsingStack {

	public static void main(String[] args) {

		String inputString = "Too hot to hoot!";

		System.out.println(isPalindromeOrNot(inputString));

	}

	private static boolean isPalindromeOrNot(String inputString) {
		boolean isPalindrome = false;

		inputString = inputString.toLowerCase();

		Stack<Character> stack = new Stack<>();
		for (Character eachChar : inputString.toCharArray()) {
			if (Character.isLetterOrDigit(eachChar)) {
				stack.push(eachChar);
			}
		}
		System.out.println(stack);

		String string = "";
		String reverse = "";
		for (Character eachChar : stack) {
			string = string + eachChar;
		}
		System.out.println(string);

		while (!stack.isEmpty()) {
			reverse = reverse + stack.pop();
		}
		System.out.println(reverse);

		isPalindrome = string.equals(reverse);

		return isPalindrome;
	}

}
