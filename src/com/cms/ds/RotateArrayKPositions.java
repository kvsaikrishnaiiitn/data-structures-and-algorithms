package com.cms.ds;

import java.util.Arrays;

public class RotateArrayKPositions {

	public static void main(String[] args) {

		int[] nums = { -1, -100, 3, 99 };
		int k = 2;
		
		rotateArray(nums, k);

		System.out.println(Arrays.toString(nums));

	}

	static void rotateArray(int[] nums, int k) {
		int n = nums.length;
		for (int i = 0; i < k; i++) {
			int temp = nums[n - 1];
			for (int index = n - 1; index >= 0; index--) {
				if (index == 0) {
					nums[0] = temp;
				} else {
					nums[index] = nums[index - 1];
				}
			}
			//System.out.println(Arrays.toString(nums));
		}
	}

}
