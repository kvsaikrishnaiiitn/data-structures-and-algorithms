package com.cms.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfAnArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 30 };

		List<List<Integer>> permute = permute(array);

		System.out.println("Permuations of array : [10, 20, 30] are:");
		System.out.println("=========================================");
		for (List<Integer> perm : permute) {
			System.out.println(perm);
		}

	}

	private static List<List<Integer>> permute(int[] array) {
		List<List<Integer>> list = new ArrayList<>();
		permuteHelper(list, new ArrayList<Integer>(), array);
		return list;
	}

	private static void permuteHelper(List<List<Integer>> list, ArrayList<Integer> resultList, int[] array) {
		System.out.println("permuteHelper");
		System.out.println("list:" + list);
		System.out.println("resultList:" + resultList);
		System.out.println("array:" + Arrays.toString(array));

		if (resultList.size() == array.length) {
			System.out.println("adding to list");
			list.add(new ArrayList<>(resultList));
		} else {
			for (int index = 0; index < array.length; index++) {
				System.out.println("index:" + index);
				if (resultList.contains(array[index])) {
					System.out.println("skipping");
					// If element already exists in the list then skip
					continue;
				}
				// Choose element
				resultList.add(array[index]);
				// Explore
				permuteHelper(list, resultList, array);
				// Unchoose element
				resultList.remove(resultList.size() - 1);
			}
		}

	}

}
