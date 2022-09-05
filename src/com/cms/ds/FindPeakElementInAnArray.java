package com.cms.ds;

public class FindPeakElementInAnArray {

	public static void main(String[] args) {
		int[] array = { 10, 20, 40, 15 };
		System.out.println(array[findPeakElementInAnArray(array, 0, array.length - 1)]);
	}

	public static int findPeakElementInAnArray(int[] array, int startIndex, int endIndex) {
		int mid = (startIndex + endIndex) / 2;
		if (mid > 0 && mid != array.length - 1 && array[mid] >= array[mid - 1] && array[mid] >= array[mid + 1]) {
			//System.out.println("1");
			return mid;
		} else if (mid == 0 && mid != array.length - 1 && array[mid] >= array[mid + 1]) {
			//System.out.println("2");
			return mid;
		} else if (mid == array.length - 1 && mid != 0 && array[mid] >= array[mid - 1]) {
			//System.out.println("3");
			return mid;
		} else if (mid != 0 && array[mid - 1] > array[mid]) {
			//System.out.println("4");
			return findPeakElementInAnArray(array, startIndex, mid - 1);
		} else {
			//System.out.println("5");
			if (mid + 1 <= array.length - 1) {
				return findPeakElementInAnArray(array, mid + 1, endIndex);
			}
		}
		System.out.println("end");
		return 0;
	}

}
