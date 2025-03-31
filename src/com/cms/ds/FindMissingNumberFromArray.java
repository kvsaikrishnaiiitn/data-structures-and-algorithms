package com.cms.ds;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 4, 5 };

		int totalSumAsPerFormula = ((numbers.length + 1) * (numbers.length + 2)) / 2;
		System.out.println("FindMissingNumberFromArray.main()...totalSumAsPerFormula:" + totalSumAsPerFormula);

		int totalSum = 0;
		for (int eachNumber : numbers) {
			totalSum += eachNumber;
		}
		System.out.println("FindMissingNumberFromArray.main()...totalSum:" + totalSum);
		System.out.println("Missing number:" + (totalSumAsPerFormula - totalSum));

	}

}
