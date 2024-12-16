package com.cms.gfg;

public class MaximumSumSubarray_Day10 {

	public static void main(String[] args) {

		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };
		int n = arr.length;

		/**
		 * Algo: Kadane's algorithm
		 */
		int maxEnding = arr[0];
		int res = arr[0];

		for (int index = 1; index < n; index++) {
			maxEnding = Math.max(maxEnding + arr[index], arr[index]);
			// System.out.println("MaximumSumSubarray_Day10.main()...maxEnding:" +
			// maxEnding);
			if (maxEnding > res) {
				res = maxEnding;
				// System.out.println("MaximumSumSubarray_Day10.main()...res:" + res);
			}
		}
		System.out.println("MaximumSumSubarray_Day10.main()...res:" + res);

	}

}
