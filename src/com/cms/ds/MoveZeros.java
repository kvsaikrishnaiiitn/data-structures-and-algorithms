package com.cms.ds;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int[] nums = { 0 };
		System.out.println(Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return;
		}

		int pointerIndex = 0;
		for (int index = 0; index < nums.length; index++) {
			if (nums[index] != 0) {
				nums[pointerIndex] = nums[index];
				pointerIndex++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("pointerIndex:" + pointerIndex);

		for (int index = pointerIndex; index < nums.length; index++) {
			nums[index] = 0;
		}
	}

}
