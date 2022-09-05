package com.cms.ds;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {

	public static void main(String[] args) {

		String[] strings = { "firstString", "secondString", "thirdString" };

		System.out.println(Arrays.toString(strings));
		System.out.println("--------------------------");
		StringBuilder stringBuilder = new StringBuilder();
		for (String eachString : strings) {
			stringBuilder.append(eachString);
		}
		System.out.println(stringBuilder.toString());
		System.out.println("--------------------------");
		System.out.println(String.join("", strings));
		System.out.println("--------------------------");
		System.out.println(Arrays.stream(strings).collect(Collectors.joining()));

	}

}
