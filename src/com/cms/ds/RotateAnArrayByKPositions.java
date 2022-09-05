package com.cms.ds;

import java.util.Arrays;

public class RotateAnArrayByKPositions {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(rotateArrayByKTimes(array, 1)));
	}

	public static int[] rotateArrayByKTimes(int[] array, int k) {
		while (k > 0) {
			for (int index = array.length - 1; index > 0; index--) {
				int temp = array[index];
				array[index] = array[index - 1];
				array[index - 1] = temp;
			}
			k--;
		}

		return array;
	}

}
