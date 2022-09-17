package com.cms.ds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(findTwoSumUsingHashMap(nums, target)));
	}

	private static int[] findTwoSum(int[] nums, int target) {
		if (nums == null || nums.length == 1) {
			return new int[] { -1, -1 };
		}

		for (int index = 0; index < nums.length - 1; index++) {
			for (int index2 = index + 1; index2 < nums.length; index2++) {
				if (nums[index] + nums[index2] == target) {
					return new int[] { index, index2 };
				}
			}
		}
		return new int[] { -1, -1 };
	}

	private static int[] findTwoSumUsingHashMap(int[] nums, int target) {
		if (nums == null || nums.length == 1) {
			return new int[] { -1, -1 };
		}

		int n = nums.length;
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int index = 0; index < n; index++) {
			int delta = target - nums[index];
			if (numsMap.containsKey(delta)) {
				return new int[] { numsMap.get(delta), index };
			} else {
				numsMap.put(nums[index], index);
			}
		}

		return new int[] { -1, -1 };
	}
}
