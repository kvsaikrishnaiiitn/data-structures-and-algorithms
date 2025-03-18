package gfg;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 6, 5, 4 };
		int pivot = -1;
		// find pivot element from last to check the 1st non-descending element from
		// right
		for (int index = numbers.length - 2; index > -1; index--) {
			if (numbers[index] < numbers[index + 1]) {
				pivot = index;
				break;
			}
		}
		// corner case if pivot = -1, simply print reverse
		if (pivot == -1) {
			reverseArray(numbers, 0, numbers.length - 1);
			System.out.println(Arrays.toString(numbers));
		}

		for (int index = numbers.length - 1; index > 0; index--) {
			if (numbers[pivot] < numbers[index]) {
				int temp = numbers[pivot];
				numbers[pivot] = numbers[index];
				numbers[index] = temp;
				break;
			}
		}
		System.out.println("After replacing with pivot:" + Arrays.toString(numbers));
		reverseArray(numbers, pivot + 1, numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
	}

	private static void reverseArray(int[] numbers, int left, int right) {
		while (left < right) {
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;

			left++;
			right--;
		}
	}

}
