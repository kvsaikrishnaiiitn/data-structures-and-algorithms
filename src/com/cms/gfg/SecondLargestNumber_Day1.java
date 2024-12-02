package com.cms.gfg;

public class SecondLargestNumber_Day1 {
	public static void main(String[] args) {
		int arr[] = { 10, 10, 5 };
		System.out.println("Second largest number:" + findSecondLargestNumber(arr));
	}

	public static int findSecondLargestNumber(int[] arr) {
		int arrayLegth = arr.length;
		if (arrayLegth < 2) {
			return -1;
		} else {
			int largestNumber = Integer.MIN_VALUE;
			int secondLargestNumber = Integer.MIN_VALUE;

			for (int index = 0; index < arr.length; index++) {
				int currentValue = arr[index];
				if (currentValue > largestNumber) {
					secondLargestNumber = largestNumber;
					largestNumber = currentValue;
				} else if (currentValue > secondLargestNumber && currentValue != largestNumber) {
					secondLargestNumber = currentValue;
				}
			}
			if (secondLargestNumber == Integer.MIN_VALUE) {
				return -1;
			} else {
				return secondLargestNumber;
			}
		}
	}

}
