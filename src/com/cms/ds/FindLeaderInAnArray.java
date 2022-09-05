package com.cms.ds;

public class FindLeaderInAnArray {

	public static void main(String[] args) {
		int[] array = { 14, 12, 70, 15, 99, 65, 21, 90 };
		findLeaderInAnArray(array);
	}

	public static void findLeaderInAnArray(int[] array) {

		for (int index = 0; index < array.length; index++) {
			boolean isLeader = true;
			for (int secondIndex = index + 1; secondIndex < array.length; secondIndex++) {
				if (array[index] < array[secondIndex]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				System.out.println("Leader:" + array[index]);
			}
		}
	}
}
