package com.cms.gfg;

import java.util.HashMap;
import java.util.Iterator;

public class AnagramCheck_Day16 {
	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "ab";

		System.out.println(anagramsCheck(s1, s2));

	}

	private static boolean anagramsCheck(String s1, String s2) {
		boolean anagrams = false;
		if (s1.length() != s2.length()) {
			return anagrams;
		} else {
			HashMap<Character, Integer> frequencyMap = new HashMap<>();
			for (char eachChar : s1.toCharArray()) {
				frequencyMap.put(eachChar, frequencyMap.getOrDefault(eachChar, 0) + 1);
			}
			System.out.println("frequencyMap:" + frequencyMap);
			for (char eachChar : s2.toCharArray()) {
				frequencyMap.put(eachChar, frequencyMap.getOrDefault(eachChar, 0) - 1);
			}
			System.out.println("frequencyMap:" + frequencyMap);

			Iterator<Character> iterator = frequencyMap.keySet().iterator();
			while (iterator.hasNext()) {
				Character eachChar = iterator.next();
				if (frequencyMap.get(eachChar) != 0) {
					return anagrams;
				}
			}
			anagrams = true;
		}

		return anagrams;
	}

}
