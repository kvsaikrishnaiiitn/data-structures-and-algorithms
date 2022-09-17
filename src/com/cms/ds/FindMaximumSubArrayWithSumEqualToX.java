package com.cms.ds;

public class FindMaximumSubArrayWithSumEqualToX {

	static void findSubArraySumEqualToX(int arr[], int X) {
		int currentSum;
		for (int i = 0; i < arr.length; i++) {
			currentSum = arr[i];
			// try all subarrays starting with 'i'
			for (int j = i + 1; j <= arr.length; j++) {
				if (currentSum == X) {
					int endIndexForContArray = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + endIndexForContArray);
					for (int k = i; k <= endIndexForContArray; k++) {
						System.out.print(arr[k] + " ");
					}
					//System.out.println("returning");
					return;
				}
				if (currentSum > X || j == arr.length) {
					break;
				}
				currentSum = currentSum + arr[j];
			}
		}

		System.out.println("No subarray found");
		return;
	}

	public static void main(String args[]) {
		// int arr[] = { 1, 8, -3, -7, 2, 7, -1, -9 };
		int arr[] = { 5, -1, 3, -1, -3, 4, -1, 2, 1, -5, 4 };

		findSubArraySumEqualToX(arr, 6);

	}
}
