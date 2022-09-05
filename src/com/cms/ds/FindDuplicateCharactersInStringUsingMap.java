package com.cms.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharactersInStringUsingMap {

	public static void main(String[] args) {
		String string = "Java";
		findDuplicatesUsingMap(string);
	}

	public static void findDuplicatesUsingMap(String string) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (int index = 0; index < string.length(); index++) {
			if (charCount.containsKey(string.charAt(index))) {
				charCount.put(string.charAt(index), charCount.get(string.charAt(index)) + 1);
			} else {
				charCount.put(string.charAt(index), 1);
			}
		}

		for (Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
