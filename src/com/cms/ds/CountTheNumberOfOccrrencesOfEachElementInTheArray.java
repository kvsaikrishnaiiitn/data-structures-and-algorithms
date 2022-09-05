package com.cms.ds;

import java.util.Arrays;

public class CountTheNumberOfOccrrencesOfEachElementInTheArray {

	public static void main(String[] args) {

		int[] array = { 0, 1, 1, 1, 3, 3, 4, 5, 5, 6, 6, 9, 9, 9 };
		countTheNumberOfOccrrencesOfEachElementInTheArray(array);

	}

	public static void countTheNumberOfOccrrencesOfEachElementInTheArray(int[] array) {

		int max = array[array.length - 1];

		int[] frequencyArray = new int[max + 1];
		System.out.println(Arrays.toString(frequencyArray));

		for (int index = 0; index < array.length; index++) {
			frequencyArray[array[index]]++;
		}

		System.out.println(Arrays.toString(frequencyArray));

		for (int index = 0; index < frequencyArray.length; index++) {
			if (frequencyArray[index] >= 1) {
				System.out.println("Fequency of " + index + ":" + frequencyArray[index]);
			}

		}

	}

}
