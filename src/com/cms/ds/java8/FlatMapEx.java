package com.cms.ds.java8;

import java.util.List;

public class FlatMapEx {

	public static void main(String[] args) {

		List<String> fruits = List.of("Apple", "Banana", "Mango", "Watermelon");
		fruits.stream().map(String::toUpperCase).forEach(System.out::println);
		
		System.out.println("FlatMap....");
		List<List<String>> fruitsList = List.of(List.of("Apple", "Banana"), List.of("Mango", "Watermelon"));
		fruitsList.stream().flatMap(List::stream).map(String::toUpperCase).forEach(System.out::println);

	}

}
