package com.cms.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheNumberOccuringOddTimesUsingStream {

	public static void main(String[] args) {

		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
		List<Integer> allNumbers = new ArrayList<>();
		for (int eachInt : array) {
			allNumbers.add(eachInt);
		}

		List<Integer> allOddOccuringNumbers = allNumbers.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() % 2 == 1).map(e -> e.getKey()).collect(Collectors.toList());
		//System.out.println(allOddOccuringNumbers);

		allOddOccuringNumbers.stream().forEach(System.out::println);

	}
}
