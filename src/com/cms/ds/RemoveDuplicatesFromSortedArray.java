package com.cms.ds;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		ArrayList<Object> removedElements = removeDuplicates(nums);
		System.out.println((int) removedElements.get(0));
		System.out.println(Arrays.toString((int[]) removedElements.get(1)));
	}

	static ArrayList<Object> removeDuplicates(int[] nums) {
		int duplicateCount = 0;
		ArrayList<Object> list = new ArrayList<>();
		for (int index1 = 0; index1 < nums.length - 1 - duplicateCount; index1++) {
			for (int index2 = index1 + 1; index2 < nums.length - duplicateCount; index2++) {
				if (nums[index1] == nums[index2]) {
					duplicateCount++;
					// We need to move the nums[index2] to last element
					moveElementToLastIndex(nums, index2);
					//System.out.println("after moveElementToLastIndex:" + Arrays.toString(nums));
					index2--;
				}
			}
		}

		list.add(nums.length - duplicateCount);
		list.add(nums);

		return list;
	}

	static int[] moveElementToLastIndex(int[] nums, int index) {
		int temp = nums[index];
		for (int tempIndex = index; tempIndex < nums.length; tempIndex++) {
			if (tempIndex == nums.length - 1) {
				nums[tempIndex] = temp;
			} else {
				nums[tempIndex] = nums[tempIndex + 1];
			}
		}
		return nums;
	}

}
