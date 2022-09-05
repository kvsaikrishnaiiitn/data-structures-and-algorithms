package com.cms.ds;

public class FindAPairWhoseSumIsClosestToX {

	public static void main(String[] args) {

		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };

		findAPairWhoseSumIsClosestToX(array, 5);

	}

	public static void findAPairWhoseSumIsClosestToX(int[] array, int x) {

		int firstElementIndex = 0;
		int secondElementIndex = 1;
		int minmumSum = array[firstElementIndex] + array[secondElementIndex] - x;

		int arrayLength = array.length;
		int tempSum = 0;
		for (int firstIndex = 2; firstIndex < arrayLength; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < arrayLength; secondIndex++) {
				tempSum = array[firstIndex] + array[secondIndex] - x;
				if (Math.abs(tempSum) < Math.abs(minmumSum)) {
					minmumSum = tempSum;
					firstElementIndex = firstIndex;
					secondElementIndex = secondIndex;
				}
			}
		}

		/*
		 * System.out.println("minimumSum:" + minmumSum + ", firstElementIndex:" +
		 * firstElementIndex + ", secondElementIndex:" + secondElementIndex);
		 */
		System.out.println("pair:" + array[firstElementIndex] + ", " + array[secondElementIndex]);

	}

}
