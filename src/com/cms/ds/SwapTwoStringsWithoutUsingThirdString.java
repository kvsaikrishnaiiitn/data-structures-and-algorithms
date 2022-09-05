package com.cms.ds;

public class SwapTwoStringsWithoutUsingThirdString {

	public static void main(String[] args) {

		String firstString = "firstString";
		String secondString = "secondString";

		firstString = firstString.concat(secondString);
		//System.out.println(firstString);
		secondString = firstString.substring(0, firstString.length() - secondString.length());
		//System.out.println(secondString);
		firstString = firstString.substring(secondString.length());

		System.out.println(firstString);
		System.out.println(secondString);
	}

}
