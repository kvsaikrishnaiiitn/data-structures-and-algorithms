package com.cms.ds.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesAndPrintInReverseOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 2, 3, 1, 2, 1);

		List<Integer> output = list.stream().distinct().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("RemoveDuplicatesAndPrintInReverseOrder.main()...output:" + output);

	}

}
