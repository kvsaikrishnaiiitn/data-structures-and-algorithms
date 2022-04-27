package com.cms.ds;

public class FindTheNumberOccuringOddTimesUsingXor {

	public static void main(String[] args) {
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };

		int result = 0;

		for (int eachElement : array) {
			//System.out.print("result:" + result);
			//XOR operation
			result = result ^ eachElement;
			//System.out.print(", element:" + eachElement);
			
			//System.out.println(", result after XOR:" + result);
		}

		System.out.println(result);

	}

}
