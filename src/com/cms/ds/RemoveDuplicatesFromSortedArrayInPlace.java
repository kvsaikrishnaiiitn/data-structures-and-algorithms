package com.cms.ds;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayInPlace {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	static int removeDuplicates(int[] nums) {
		int n = nums.length;
		int insertIndex = 1;
		if (n == 0) {
			return 0;
		} else {
			for (int index = 1; index < n; index++) {
				if (nums[index] != nums[index - 1]) {
					nums[insertIndex] = nums[index];
					insertIndex++;
				}
			}
		}
		return insertIndex;
	}
}
