package com.cms.ds;

import java.util.HashMap;
import java.util.Map;

public class FindTheNumberOccuringOddTimes {

	public static void main(String[] args) {

		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };

		Map<Integer, Integer> eachNumberCount = new HashMap<>();

		for (int eachNumber : array) {
			if (eachNumberCount.containsKey(eachNumber)) {
				eachNumberCount.put(eachNumber, eachNumberCount.get(eachNumber) + 1);
			} else {
				eachNumberCount.put(eachNumber, 1);
			}
		}

		System.out.println(eachNumberCount);

		for (int eachKey : eachNumberCount.keySet()) {
			if (eachNumberCount.get(eachKey) % 2 == 1) {
				System.out.println("Odd occuring numbers:" + eachKey);
			}
		}

	}

}
