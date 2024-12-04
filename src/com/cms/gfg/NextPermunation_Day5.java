package com.cms.gfg;

import java.util.Arrays;

public class NextPermunation_Day5 {

	public static void main(String[] args) {

		int arr[] = { 4, 5, 3, 1, 2 };
		// int arr[] = { 5, 4, 3, 2, 1 };
		System.out.println("NextPermunation_Day5.main()...input array:" + Arrays.toString(arr));

		nextPermutation(arr);
		System.out.println("NextPermunation_Day5.main()...next permutation:" + Arrays.toString(arr));
	}

	private static void nextPermutation(int[] arr) {
		/**
		 * Algorithm 1. Need to find the pivot which is not in the descending from right
		 * most 2. Find the big number than that pivot element from the right most and
		 * swap with pivot 3. Reverse all elements next right to pivot element.
		 */

		int n = arr.length;
		// 1. Need to find the pivot which is not in the descending from right most
		int pivot = -1;
		for (int index = n - 1; index > 0; index--) {
			if (arr[index] > arr[index - 1]) {
				pivot = index - 1;
				break;
			}
		}

		// System.out.println("NextPermunation_Day5.main()...pivot:" + pivot);

		// reverse the array and return as it's the last permutation
		if (pivot == -1) {
			reverseArray(arr, 0, n - 1);

		} else {
			// 2. Find the big number than that pivot element from the right most and swap
			for (int index = n - 1; index >= 0; index--) {
				if (arr[index] > arr[pivot]) {
					int temp = arr[index];
					arr[index] = arr[pivot];
					arr[pivot] = temp;
					break;
				}
			}
			// 3. Reverse all elements next right to pivot element.
			reverseArray(arr, pivot + 1, n - 1);
		}
	}

	private static void reverseArray(int[] arr, int left, int right) {
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
