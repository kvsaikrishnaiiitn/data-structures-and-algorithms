package com.cms.ds;

public class FindSecondHighest {

	public static void main(String[] args) {

		int[] numbers = { 7, 5, 6, 1, 4, 2 };
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > highest) {
				secondHighest = highest;
				highest = numbers[index];
			} else if (numbers[index] > secondHighest && highest > numbers[index]) {
				secondHighest = numbers[index];
			}
		}
		
		System.out.println(highest);
		System.out.println(secondHighest);

	}

}
