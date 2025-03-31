package com.cms.ds.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);
		// list.stream().forEach(System.out::println);

		list.stream().map(i -> i * i).forEach(System.out::println);

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));
		System.out.println("FlatMapExample.main()...listOfLists:" + listOfLists);

		List<Integer> allNumbers = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("FlatMapExample.main()...allNumbers:" + allNumbers);

		List<String> strings = Arrays.asList("Hello World", "It's Java Code");
		List<String> allWords = strings.stream().flatMap(s -> Stream.of(s.split(" "))).collect(Collectors.toList());
		System.out.println("FlatMapExample.main()...allWords:" + allWords);

		List<String> helloWorld = Arrays.asList("Hello", "World");
		List<Character> allChars = helloWorld.stream().flatMap(s -> s.chars().mapToObj(c -> (char) c))
				.collect(Collectors.toList());
		System.out.println("FlatMapExample.main()...allChars:" + allChars);

	}

}
