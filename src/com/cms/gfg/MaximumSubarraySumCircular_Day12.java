package com.cms.gfg;

import java.util.Arrays;

public class MaximumSubarraySumCircular_Day12 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		int n = arr.length;

		int maxSubarraySumCircuar = Integer.MIN_VALUE;

		System.out.println("MaximumSubarrayProduct_Day11.main()...arr:" + Arrays.toString(arr));

		/**
		 * Algo: MaxSumCircular = Max(NormalSum, CircularSum) CircularSum = TotalSum -
		 * MinSum
		 * 
		 * CornerCase(If all elements are negative): TotalSum = MinSum, then NormalSum =
		 * MaxSumCircular
		 */
		int totalSum = 0;
		int currentMax = 0;
		int currentMin = 0;
		int maxSum = arr[0];
		int minSum = arr[0];

		for (int index = 0; index < n; index++) {
			totalSum += arr[index];

			// maxSubArray
			currentMax = Math.max(currentMax + arr[index], arr[index]);
			if (currentMax > maxSum) {
				maxSum = currentMax;
			}
			// minSubArray
			currentMin = Math.min(currentMin + arr[index], arr[index]);
			if (currentMin < minSum) {
				minSum = currentMin;
			}
		}

		int normalSum = maxSum;
		System.out.println("MaximumSubarraySumCircular_Day12.main()...normalSum:" + normalSum);
		int circularSum = totalSum - minSum;
		System.out.println("MaximumSubarraySumCircular_Day12.main()...circularSum:" + circularSum);

		if (totalSum == minSum) {
			maxSubarraySumCircuar = normalSum;
		}

		maxSubarraySumCircuar = Math.max(normalSum, circularSum);

		System.out.println("MaximumSubarraySumCircular_Day12.main()...maxSubarraySumCircuar:" + maxSubarraySumCircuar);

	}
}
