package com.cms.ds.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		/*
		 * List<Integer> evenNumbers = numbers.stream().filter(i -> { if (i % 2 == 0) {
		 * return true; } return false; }).collect(Collectors.toList());
		 */

		List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		System.out.println("EvenNumbersFromList.main()...evenNumbers:" + evenNumbers);
	}

}
