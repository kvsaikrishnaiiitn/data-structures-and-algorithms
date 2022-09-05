package com.cms.ds;

public class FindAPairWhoseSumIsClosestToZero {

	public static void main(String[] args) {

		int array[] = { 1, 3, -5, 7, 8, 20, -40, 6 };

		findAPairWhoseSumIsClosestToZero(array);

	}

	public static void findAPairWhoseSumIsClosestToZero(int[] array) {

		int firstElementIndex = 0;
		int secondElementIndex = 1;
		int minmumSum = array[firstElementIndex] + array[secondElementIndex];

		int arrayLength = array.length;
		int tempSum = 0;
		for (int firstIndex = 2; firstIndex < arrayLength; firstIndex++) {
			for (int secondIndex = firstIndex + 1; secondIndex < arrayLength; secondIndex++) {
				tempSum = array[firstIndex] + array[secondIndex];
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
