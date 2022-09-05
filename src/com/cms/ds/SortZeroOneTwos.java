package com.cms.ds;

import java.util.Arrays;

public class SortZeroOneTwos {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 1, 0, 1, 1, 2, 2, 0, 0 };
		System.out.println(Arrays.toString(sortZeroOneTows(array)));

	}

	public static int[] sortZeroOneTows(int[] array) {
		int countOfZeros = 0;
		int countOfOnes = 0;

		for (int index = 0; index < array.length; index++) {
			int number = array[index];
			if (number == 0) {
				countOfZeros++;
			} else if (number == 1) {
				countOfOnes++;
			}
		}

		for (int index = 0; index < array.length; index++) {
			if (countOfZeros > 0) {
				array[index] = 0;
				countOfZeros--;
			} else if (countOfOnes > 0) {
				array[index] = 1;
				countOfOnes--;
			} else {
				array[index] = 2;
			}
		}
		return array;
	}

}
