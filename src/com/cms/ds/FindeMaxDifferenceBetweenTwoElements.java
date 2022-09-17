package com.cms.ds;

public class FindeMaxDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		int[] array = { 14, 12, 70, 15, 95, 65, 22, 30 };
		findMaxDifferenceBetweenTwoElements(array);
	}

	public static int findMaxDifferenceBetweenTwoElements(int[] array) {
		int maxDifference = Integer.MIN_VALUE;
		int firstElement = -1;
		int secondElement = -1;
		for (int firstIndex = 0; firstIndex < array.length - 1; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < array.length; secondIndex++) {
				if (array[firstIndex] < array[secondIndex] && array[secondIndex] - array[firstIndex] > maxDifference) {
					maxDifference = array[secondIndex] - array[firstIndex];
					firstElement = array[firstIndex];
					secondElement = array[secondIndex];
				}
			}
		}
		if (maxDifference != Integer.MIN_VALUE) {
			System.out.println("max Difference:" + maxDifference);
			System.out.println("first element:" + firstElement);
			System.out.println("second element:" + secondElement);
		}

		return maxDifference;
	}

}
