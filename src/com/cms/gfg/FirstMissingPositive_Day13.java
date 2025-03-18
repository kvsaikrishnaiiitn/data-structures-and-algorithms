package com.cms.gfg;

import java.util.Arrays;

public class FirstMissingPositive_Day13 {
	public static void main(String[] args) {
		// int[] numbers = { 2, -3, 4, 1, 1, 7 };
		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		int smallestPositiveMissing = Integer.MIN_VALUE;

		int n = numbers.length;

		// Cycle sort algorithm - Useful only for 1...n and n length only
		for (int index = 0; index < n; index++) {
			// System.out.println("Start index:" + index + ": " + Arrays.toString(numbers));
			while (numbers[index] > 0 && numbers[index] <= n && numbers[index] != numbers[numbers[index] - 1]) {
				int temp = numbers[numbers[index] - 1];
				numbers[numbers[index] - 1] = numbers[index];
				numbers[index] = temp;
				// System.out.println(Arrays.toString(numbers));
			}
			// System.out.println("After index:" + index + ": " + Arrays.toString(numbers));
		}
		System.out.println("After all:" + Arrays.toString(numbers));
		for (int index = 0; index < n; index++) {
			if (numbers[index] != index + 1) {
				smallestPositiveMissing = index + 1;
				break;
			}
		}
		if (!(smallestPositiveMissing > 0)) {
			smallestPositiveMissing = n + 1;
		}
		System.out.println("FirstMissingPositive.main()...smallestPositiveMissing:" + smallestPositiveMissing);
	}
}
