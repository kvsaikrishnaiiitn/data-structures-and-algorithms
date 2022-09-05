package com.cms.ds;

public class FindAPairWhoseSumIsEqualToX {

	public static void main(String[] args) {

		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };

		findAPairWhoseSumIsEqualToX(array, 15);

	}

	public static void findAPairWhoseSumIsEqualToX(int[] array, int x) {

		int arrayLength = array.length;
		for (int firstIndex = 0; firstIndex < arrayLength; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < arrayLength; secondIndex++) {
				if (x == array[firstIndex] + array[secondIndex]) {
					System.out.println("pair:" + array[firstIndex] + ", " + array[secondIndex]);
				}
			}
		}
	}
}
