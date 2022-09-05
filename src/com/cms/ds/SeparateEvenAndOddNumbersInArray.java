package com.cms.ds;

import java.util.Arrays;

public class SeparateEvenAndOddNumbersInArray {

	public static void main(String[] args) {

		int[] array = { 12, 17, 70, 15, 22, 65, 21, 90 };
		Arrays.toString(array);
		separateEvenAndOddNumbersInArray(array);
		System.out.println("After separating:" + Arrays.toString(array));
	}

	public static int[] separateEvenAndOddNumbersInArray(int[] array) {
		int evenElementIndex = 0;
		int oddElementIndex = array.length - 1;

		for (int index = 0; index < array.length; index++) {
			// System.out.println("SeparateEvenAndOddNumbersInArray.separateEvenAndOddNumbersInArray()...index:"
			// + index);
			while (array[evenElementIndex] % 2 == 0) {
				evenElementIndex++;
			}
			while (array[oddElementIndex] % 2 == 1) {
				oddElementIndex--;
			}

			if (evenElementIndex < oddElementIndex) {
				// System.out.println("SeparateEvenAndOddNumbersInArray.separateEvenAndOddNumbersInArray()...swapping...");
				int temp = array[evenElementIndex];
				array[evenElementIndex] = array[oddElementIndex];
				array[oddElementIndex] = temp;
			}
		}

		return array;

	}

}
