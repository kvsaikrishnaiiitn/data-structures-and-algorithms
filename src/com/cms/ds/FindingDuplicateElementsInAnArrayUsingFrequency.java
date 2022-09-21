package com.cms.ds;

import java.util.Arrays;

public class FindingDuplicateElementsInAnArrayUsingFrequency {

	public static void main(String[] args) {
		// Array should contain only positive numbers in this case
		int[] numbers = { 1, 2, 3, 1, 2, 5 };
		printAllDuplicates(numbers);
	}

	public static void printAllDuplicates(int[] numbers) {

		int maxNumber = Integer.MIN_VALUE;
		for (int index = 0; index < numbers.length; index++) {
			if (maxNumber < numbers[index]) {
				maxNumber = numbers[index];
			}
		}

		/*
		 * System.out.println(
		 * "FindingDuplicateElementsInAnArrayUsingFrequency.printAllDuplicates()...maxNumber:"
		 * + maxNumber);
		 */

		int[] frequencyArray = new int[maxNumber + 1];

		/*
		 * for (int index = 0; index < frequencyArray.length; index++) {
		 * frequencyArray[index] = 0; }
		 */

		/*
		 * System.out.println(
		 * "FindingDuplicateElementsInAnArrayUsingFrequency.printAllDuplicates()...frequencyArray:"
		 * + Arrays.toString(frequencyArray));
		 */

		for (int index = 0; index < numbers.length; index++) {
			frequencyArray[numbers[index]]++;
		}

		System.out.println("FindingDuplicateElementsInAnArrayUsingFrequency.printAllDuplicates()...frequencyArray:"
				+ Arrays.toString(frequencyArray));

		for (int index = 0; index < frequencyArray.length; index++) {
			if (frequencyArray[index] > 1) {
				System.out.println(index);
			}
		}

	}

}
