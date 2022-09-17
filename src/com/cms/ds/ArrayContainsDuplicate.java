package com.cms.ds;

import java.util.Arrays;

public class ArrayContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicates(nums));

	}

	static boolean containsDuplicates(int[] nums) {
		int n = nums.length;
		int max = Integer.MIN_VALUE;
		for (int index = 0; index < n; index++) {
			if (max < nums[index]) {
				max = nums[index];
			}
		}
		System.out.println("max:" + max);
		int[] frequencyArray = new int[max + 1];
		for (int index = 0; index < n; index++) {
			frequencyArray[nums[index]]++;
		}

		System.out.println(Arrays.toString(frequencyArray));

		for (int index = 0; index < max + 1; index++) {
			if (frequencyArray[index] > 1) {
				System.out.println(frequencyArray[index]);
				return true;
			}
		}

		return false;
	}

}
