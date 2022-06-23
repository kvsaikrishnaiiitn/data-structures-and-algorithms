package com.cms.ds;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindSecondHighestUsingStream {

	public static void main(String[] args) {

		int[] numbers = { 7, 5, 6, 1, 4, 2 };

		OptionalInt highest = Arrays.stream(numbers).sorted().skip(numbers.length - 1).findFirst();
		OptionalInt secondHighest = Arrays.stream(numbers).sorted().skip(numbers.length - 2).findFirst();

		System.out.println(highest.getAsInt());
		System.out.println(secondHighest.getAsInt());

	}

}
