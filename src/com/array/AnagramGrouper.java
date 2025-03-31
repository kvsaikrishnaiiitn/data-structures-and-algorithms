package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouper {

	public static Map<String, List<String>> groupAnagrams(List<String> strings) {
		if (strings == null || strings.isEmpty()) {
			return new HashMap<>();
		}

		return strings.stream().collect(Collectors.groupingBy(str -> {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}));
	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		Map<String, List<String>> anagramGroups = groupAnagrams(input);

		anagramGroups.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
	}
}