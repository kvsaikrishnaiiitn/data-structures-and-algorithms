package com.cms.ds;

import java.util.Arrays;

public class FindMaximumSubArraySum {

	/*
	 * Dynamic programming algorithm to find largest sum continuous subarray
	 */
	public int dynamicProgramForMaxSubArray(int[] arr) {
		int[] result = new int[arr.length];
		result[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			result[i] = Math.max(result[i - 1] + arr[i], arr[i]);
		}
		System.out.println(Arrays.toString(result));
		int maxSumArray = result[0];
		for (int j = 1; j < result.length; j++) {
			if (maxSumArray < result[j])
				maxSumArray = result[j];
		}

		return maxSumArray;

	}

	public static void main(String args[]) {
		// int arr[] = { 1, 8, -3, -7, 2, 7, -1, -9 };
		int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		FindMaximumSubArraySum maxSum = new FindMaximumSubArraySum();

		System.out.println("Largest sum continuous subarray is " + maxSum.dynamicProgramForMaxSubArray(arr));
	}
}
