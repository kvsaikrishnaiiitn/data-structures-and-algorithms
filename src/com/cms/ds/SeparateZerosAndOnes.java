package com.cms.ds;

import java.util.Arrays;

public class SeparateZerosAndOnes {

	public static void main(String[] args) {

		int[] array = { 0, 1, 0, 0, 1, 1, 1, 0, 1 };
		Arrays.toString(array);
		separateZerosAndOnes(array);
		System.out.println("After separating:" + Arrays.toString(array));

	}

	public static int[] separateZerosAndOnes(int[] array) {
		int countOfZeros = 0;
		for (int eachElement : array) {
			if (eachElement == 0) {
				countOfZeros++;
			}
		}

		for (int index = 0; index < countOfZeros; index++) {
			array[index] = 0;
		}

		for (int index = countOfZeros; index < array.length; index++) {
			array[index] = 1;
		}
		return array;
	}

}
