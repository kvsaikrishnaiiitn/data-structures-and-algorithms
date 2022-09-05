package com.cms.ds;

public class FindSubArrayWithTheGivenSumInAnArray {

	public static void main(String[] args) {
		int[] array = { 2, 3, 6, 4, 9, 0, 11 };
		findSubArrayWithTheGivenSumInAnArray(array, 9);
	}

	public static void findSubArrayWithTheGivenSumInAnArray(int[] array, int sum) {

		for (int startIndex = 0; startIndex < array.length; startIndex++) {
			int tempSum = 0;
			for (int endIndex = startIndex; endIndex < array.length; endIndex++) {
				tempSum = tempSum + array[endIndex];
				if (tempSum == sum) {
					System.out.println("startIndex:" + startIndex + ", endIndex:" + endIndex);
				}
			}

		}

	}

}
