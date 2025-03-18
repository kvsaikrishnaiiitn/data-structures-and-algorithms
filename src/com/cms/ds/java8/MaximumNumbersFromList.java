package com.cms.ds.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumbersFromList {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> maxNumber = numbers.stream().max(Integer::compare);
		System.out.println("MaximumNumbersFromList.main()...maxNumber:" + maxNumber.orElse(null));

	}

}
