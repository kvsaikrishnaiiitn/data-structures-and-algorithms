package com.cms.ds;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 3, 2, 4, 5 };
		int target = 6;

		int[] output = findTwoSum(numbers, target);
		System.out.println(output[0] + "," + output[1] + " -> " + numbers[output[0]] + "," + numbers[output[1]]);

	}

	public static int[] findTwoSum(int[] numbers, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for (int index = 0; index < numbers.length; index++) {
			int delta = target - numbers[index];
			System.out.println("delta:" + delta);
			if (numMap.containsKey(delta)) {
				return new int[] { delta, numMap.get(delta) };
			} else {
				numMap.put(numbers[index], index);
			}
		}
		return new int[] { -1, -1 };
	}
}
