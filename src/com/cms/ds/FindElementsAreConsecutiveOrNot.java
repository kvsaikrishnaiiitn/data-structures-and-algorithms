package com.cms.ds;

public class FindElementsAreConsecutiveOrNot {

	public static void main(String[] args) {
		int array[] = { 47, 43, 45, 44, 44 };
		System.out.println(findElementsAreConsecutiveOrNot(array));
	}

	public static boolean findElementsAreConsecutiveOrNot(int[] array) {
		boolean consecutiveElements = false;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int eachElement : array) {
			if (min > eachElement) {
				min = eachElement;
			}
			if (max < eachElement) {
				max = eachElement;
			}
		}

		boolean[] visitedArray = new boolean[array.length];

		if (max - min + 1 == array.length) {
			for (int index = 0; index < array.length; index++) {
				if (visitedArray[array[index] - min] != false) {
					consecutiveElements = false;
					return consecutiveElements;
				}
				visitedArray[array[index] - min] = true;
			}
			consecutiveElements = true;
		} else {
			consecutiveElements = false;
		}
		return consecutiveElements;
	}

}
