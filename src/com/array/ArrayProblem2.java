package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group Strings that are Anagrams of Each Other
 */
public class ArrayProblem2 {

	public static void main(String[] args) {

		List<String> inputList = Arrays.asList("abc", "cab", "bba");
		// Output: [["abc", "cab"], ["bba"]]

		Map<String, List<String>> groupByAnagrams = new HashMap<>();
		for (String eachString : inputList) {
			char[] allChars = eachString.toCharArray();
			Arrays.sort(allChars);
			String keyToCheck = new String(allChars);
			if (groupByAnagrams.containsKey(keyToCheck)) {
				List<String> existingList = groupByAnagrams.get(keyToCheck);
				existingList.add(eachString);
				groupByAnagrams.put(keyToCheck, existingList);
			} else {
				List<String> newList = new ArrayList<>();
				newList.add(eachString);
				groupByAnagrams.put(eachString, newList);
			}
		}

		System.out.println("ArrayProblem2.main()...groupByAnagrams:" + groupByAnagrams);

	}

}
