package com.cms.ds;

import java.util.stream.Collectors;

public class FindDuplicateCharactersInStringUsingStream {

	public static void main(String[] args) {
		String string = "Java";
		findDuplicatesUsingMap(string);
	}

	public static void findDuplicatesUsingMap(String string) {
		string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting())).entrySet()
				.stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).forEach(System.out::println);
	}

}
