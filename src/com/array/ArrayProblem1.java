package com.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Find the first element that appears more than k times in a stream of numbers.
 */
public class ArrayProblem1 {

	public static void main(String[] args) {
		// 1,2,1,2,1,4,5,2 k=2 -> Output: 2
		List<Integer> numbers = Arrays.asList(6, 1, 2, 1, 2, 1, 4, 5, 2, 6, 6, 20, 10000);
		int k = 2;
		int firstElementWithMoreFrequency = getAnswerByUsingFrequencyMap(numbers, k);
		System.out.println("ArrayProblem1.main()...firstElementWithMoreFrequency:" + firstElementWithMoreFrequency);
	}

	// 1,2,1,2,1,4,5,2 k=2 -> Output: 2
	private static int getAnswerByUsingFrequencyMap(List<Integer> numbers, int k) {
		int firstElementWithMoreFrequency = Integer.MIN_VALUE;
		Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
		for (int eachNumber : numbers) {
			if (frequencyMap.containsKey(eachNumber) && frequencyMap.get(eachNumber) == k) {
				firstElementWithMoreFrequency = eachNumber;
				break;
			}
			frequencyMap.put(eachNumber, frequencyMap.getOrDefault(eachNumber, 0) + 1);
		}
		// Corner case if no element found
		if (firstElementWithMoreFrequency == Integer.MIN_VALUE) {
			firstElementWithMoreFrequency = -1;
		}
		return firstElementWithMoreFrequency;
	}

}
