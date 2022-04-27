package com.cms.ds;

import java.util.Arrays;

public class FindPlatformsRequiredForTheStation {

	public static void main(String[] args) {

		// arr[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
		// dep[] = {1:10, 3:00, 2:20, 2:30, 3:15, 6:00}

		int arr[] = { 100, 140, 150, 200, 215, 400 };
		int dep[] = { 110, 300, 220, 230, 315, 600 };

		int maxPlatformsRequired = findMaxPlatformsRequired(arr, dep, arr.length);
		System.out.println(maxPlatformsRequired);

	}

	private static int findMaxPlatformsRequired(int[] arr, int[] dep, int length) {
		int arrivalIndex = 0;
		int departureIndex = 0;

		int platformsRequired = 0;
		int maxPlatformsRequired = 0;

		Arrays.sort(arr);
		Arrays.sort(dep);

		while (arrivalIndex < length && departureIndex < length) {
			//System.out.println(arr[arrivalIndex] + ", " + dep[departureIndex]);
			if (arr[arrivalIndex] < dep[departureIndex]) {
				//System.out.println("arrival");
				arrivalIndex++;
				platformsRequired++;
				if (platformsRequired > maxPlatformsRequired) {
					maxPlatformsRequired = platformsRequired;
				}
			} else {
				//System.out.println("departure");
				platformsRequired--;
				departureIndex++;
			}
			//System.out.println("platformsRequired:" + platformsRequired);
			//System.out.println("maxPlatformsRequired:" + maxPlatformsRequired);
		}
		return maxPlatformsRequired;
	}

}
