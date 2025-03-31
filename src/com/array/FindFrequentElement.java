package com.array;

import java.util.HashMap;
import java.util.Map;

public class FindFrequentElement {

	public static Integer findFrequentElement(int[] stream, int k) {
		if (stream == null || stream.length == 0 || k <= 0) {
			return null; // Handle invalid input
		}

		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int num : stream) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
			if (frequencyMap.get(num) > k) {
				return num; // Found the first element exceeding k times
			}
		}

		return null; // No element appears more than k times
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 4, 2, 3, 4, 5, 6, 1, 3, 1 };
		int k = 2;

		System.out.println("FindFrequentElement.main()...frequentElement:" + findFrequentElement(numbers, k));
	}

}
