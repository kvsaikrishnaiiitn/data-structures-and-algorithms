package com.cms.gfg;

import java.util.Arrays;

public class MaximumSubarrayProduct_Day11 {

	public static void main(String[] args) {

		int arr[] = { -2, 6, -3, 10, 0, 2 };
		int n = arr.length;

		System.out.println("MaximumSubarrayProduct_Day11.main()...arr:" + Arrays.toString(arr));

		/**
		 * Algo: maxEnd and minEnd
		 */
		int currentMin = arr[0];
		int currentMax = arr[0];
		int maxProduct = arr[0];

		for (int index = 1; index < n; index++) {
			int element = arr[index];
			System.out.println("MaximumSubarrayProduct_Day11.main()...element:" + element);
			int tempCurrentMin = currentMin;

			// currentMin
			currentMin = Math.min(Math.min(element, tempCurrentMin * element), currentMax * element);
			System.out.println("MaximumSubarrayProduct_Day11.main()...currentMin:" + currentMin);

			// currentMax
			currentMax = Math.max(Math.max(element, currentMax * element), tempCurrentMin * element);
			System.out.println("MaximumSubarrayProduct_Day11.main()...currentMax:" + currentMax);

			// maxProduct
			if (currentMax > maxProduct) {
				maxProduct = currentMax;
			}
			System.out.println("MaximumSubarrayProduct_Day11.main()...maxProduct:" + maxProduct);
			System.out.println();
		}
		System.out.println("MaximumSubarrayProduct_Day11.main()...maxProduct:" + maxProduct);
	}

}
