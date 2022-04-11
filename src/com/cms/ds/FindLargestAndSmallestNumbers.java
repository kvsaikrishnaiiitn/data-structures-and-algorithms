package com.cms.ds;

public class FindLargestAndSmallestNumbers {

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 6, 2, 9 };

		int smallest, largest;

		smallest = largest = numbers[0];

		for (int index = 1; index < numbers.length; index++) {
			if (numbers[index] > largest) {
				largest = numbers[index];
			}
			if (numbers[index] < smallest) {
				smallest = numbers[index];
			}
		}

		System.out.println(smallest);
		System.out.println(largest);
	}

}
