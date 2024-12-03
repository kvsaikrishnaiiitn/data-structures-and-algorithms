package com.cms.gfg;

import java.util.Arrays;

public class RotateAnArray_Day4 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		int n = arr.length;
		int d = 3;

		// To reduce the shifts
		d %= n;

		rorateArray(arr, n, d);
		System.out.println(Arrays.toString(arr));

	}

	private static void rorateArray(int[] arr, int n, int d) {
		// Algorithm: Reversal technique
		// 1. Reverse sub arrays i. number of elements[0,d] ii. remaining
		// elements[d,n-1]
		// 2. Reverse total array
		reverseArray(arr, 0, d);
		reverseArray(arr, d, n);
		reverseArray(arr, 0, n);
	}

	// Reverse method
	private static void reverseArray(int[] arr, int start, int end) {
		int n = arr.length;
		int left = start;
		int right = end - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}

}
