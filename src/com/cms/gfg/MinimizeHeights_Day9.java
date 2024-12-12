package com.cms.gfg;

import java.util.Arrays;

public class MinimizeHeights_Day9 {
	public static void main(String[] args) {
		int arr[] = { 12, 6, 4, 15, 17, 10 };
		int k = 6;

		/*
		 * int arr[] = { 1, 5, 10, 15 }; int k = 3;
		 */

		int n = arr.length;

		System.out.println("MinimizeHeights_Day9.main()...arr:" + Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println("MinimizeHeights_Day9.main()...arr:" + Arrays.toString(arr));

		/**
		 * Algo: 1. Sort array 2. Try to find the first element where we can subtract k
		 * 3. Then find the minH or maxH 4. Find the min of earlier res, (maxH-minH)
		 */

		int res = arr[n - 1] - k - arr[0] + k;
		// System.out.println("MinimizeHeights_Day9.main()...res:" + res);
		for (int index = 1; index < n; index++) {
			if (arr[index] - k < 0) {
				continue;
			}

			// System.out.println("MinimizeHeights_Day9.main()...index:" + index);
			// System.out.println("MinimizeHeights_Day9.main()...arr[index]:" + arr[index]);

			// minH
			int minH = Math.min(arr[0] + k, arr[index] - k);
			// maxH
			int maxH = Math.max(arr[n - 1] - k, arr[index - 1] + k);

			// System.out.println("MinimizeHeights_Day9.main()...minH:" + minH);
			// System.out.println("MinimizeHeights_Day9.main()...maxH:" + maxH);

			res = Math.min(res, (maxH - minH));
			// System.out.println("MinimizeHeights_Day9.main()...res:" + res);
		}

		System.out.println("MinimizeHeights_Day9.main()...res:" + res);
	}

}
