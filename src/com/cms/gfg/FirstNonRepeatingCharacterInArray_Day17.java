package com.cms.gfg;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInArray_Day17 {
	public static void main(String[] args) {
		String input = "ageeksforgeeks";
		int[] frequencyArray = new int[26];
		for (int index = 0; index < 26; index++) {
			frequencyArray[index] = -1;
		}

		char[] allChars = input.toCharArray();
		for (Character eachChar : allChars) {
			if (frequencyArray[eachChar - 'a'] == -1) {
				frequencyArray[eachChar - 'a'] = eachChar - 'a';
			} else {
				frequencyArray[eachChar - 'a'] = -2;
			}
		}

		System.out.println(
				"FirstNonRepeatingCharacterInArray.main()...frequencyArray:" + Arrays.toString(frequencyArray));

		int minIndex = Integer.MAX_VALUE;
		for (int freqIndex = 0; freqIndex < 26; freqIndex++) {
			if (frequencyArray[freqIndex] >= 0) {
				minIndex = Math.min(minIndex, frequencyArray[freqIndex]);
			}
		}

		char nonRepeatingFirstChar = '!';
		if (minIndex != Integer.MAX_VALUE) {
			nonRepeatingFirstChar = allChars[minIndex];
		} else {
			nonRepeatingFirstChar = '$';
		}

		System.out.println("FirstNonRepeatingCharacterInArray.main()...nonRepeatingFirstChar:" + nonRepeatingFirstChar);

		// Using Java8 stream
		findNonRepeatingCharWithStream(input);

	}

	private static void findNonRepeatingCharWithStream(String s) {
		List<Character> allChars = s.chars().mapToObj(i -> (char) i).collect(Collectors.toList());
		System.out.println("FirstNonRepeatingCharacterInArray.findNonRepeatingCharWithStream()...allChars:" + allChars);

		Map<Character, Long> allCharsCount = allChars.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(
				"FirstNonRepeatingCharacterInArray.findNonRepeatingCharWithStream()...allCharsCount:" + allCharsCount);

		Character nonRepeatingCharacter = allCharsCount.entrySet().stream().filter(e -> {
			if (e.getValue() == 1) {
				return true;
			} else {
				return false;
			}
		}).map(Map.Entry::getKey).findFirst().orElse('$');
		System.out.println("FirstNonRepeatingCharacterInArray.findNonRepeatingCharWithStream()...nonRepeatingCharacter:"
				+ nonRepeatingCharacter);
	}
}
