package com.cms.gfg;

import java.util.Arrays;

public class ReverseAnArray_Day3 {
	public static void main(String[] args) {

		int[] arr = { 5, 3, 2, 1, 4, 6 };
		System.out.println("ReverseAnArray_Day3.main()...input array:" + Arrays.toString(arr));

		reverseArray(arr);
		System.out.println("ReverseAnArray_Day3.main()...reversed array:" + Arrays.toString(arr));
	}

	private static void reverseArray(int[] arr) {
		int n = arr.length;

		// Approach1
		/*
		 * for (int index = 0; index < n / 2; index++) { int temp = arr[index];
		 * arr[index] = arr[n - 1 - index]; arr[n - 1 - index] = temp; }
		 */

		// Approach2
		int left = 0;
		int right = n - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
