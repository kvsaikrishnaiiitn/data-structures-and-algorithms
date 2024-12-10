package com.cms.gfg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MajorityElement_Day6 {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 1, 3, 3, 1, 1, 2 };

		int n = arr.length;
		int k = n / 3;

		/**
		 * Algo: element frequency wise
		 */
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		for (int element : arr) {
			frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
		}

		Set<Integer> majorityElements = new TreeSet<Integer>();
		frequencyMap.forEach((t, u) -> {
			if (u > k) {
				majorityElements.add(t);
			}
		});

		System.out.println("MajorityElement_Day6.main()...majorityElements:" + majorityElements);

		/**
		 * Algo: Moore's algorithm
		 */
		int element1 = -1;
		int element2 = -1;
		int count1 = 0;
		int count2 = 0;

		for (int element : arr) {
			if (element1 == element) {
				count1++;
			} else if (element2 == element) {
				count2++;
			} else if (count1 == 0) {
				element1 = element;
				count1++;
			} else if (count2 == 0) {
				element2 = element;
				count2++;
			} else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;
		for (int element : arr) {
			if (element == element1) {
				count1++;
			} else {
				count2++;
			}
		}

		Set<Integer> resultList = new TreeSet<>();
		if (count1 > k) {
			resultList.add(element1);
		}
		if (count2 > k) {
			resultList.add(element2);
		}

		System.out.println("MajorityElement_Day6.main()...resultList:" + resultList);

	}

}
