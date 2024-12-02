package com.cms.gfg;

import java.util.Arrays;

public class MoveAllZeroesToEnd_Day2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		System.out.println("MoveAllZeroesToEnd_Day2.main()...input array:" + Arrays.toString(arr));

		int count = 0;
		int n = arr.length;
		for (int index = 0; index < n; index++) {
			if (arr[index] != 0) {
				int temp = arr[count];
				arr[count] = arr[index];
				arr[index] = temp;
				count++;
			}
		}

		System.out.println("MoveAllZeroesToEnd_Day2.main()...final array:" + Arrays.toString(arr));
	}

}
