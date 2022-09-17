package com.cms.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		System.out.println(Arrays.toString(interSectionOfTwoArrays(nums1, nums2)));
	}

	private static int[] interSectionOfTwoArrays(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		}

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int index1 = 0;
		int index2 = 0;

		List<Integer> resultList = new ArrayList<>();
		while (index1 < nums1.length && index2 < nums2.length) {
			if (nums1[index1] == nums2[index2]) {
				resultList.add(nums1[index1]);
				index1++;
				index2++;
			} else if (nums1[index1] < nums2[index2]) {
				index1++;
			} else {
				index2++;
			}
		}

		return listToArray(resultList);
	}

	private static int[] listToArray(List<Integer> resultList) {
		int[] result = new int[resultList.size()];
		int index = 0;
		for (int eachInt : resultList) {
			result[index] = eachInt;
			index++;
		}
		return result;
	}

}
