package gfg;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int left = 0;
		int right = numbers.length - 1;
		reverseArray(numbers, left, right);
		System.out.println("Reversed array:" + Arrays.toString(numbers));
	}

	private static void reverseArray(int[] numbers, int left, int right) {
		while (left < right) {
			int temp = numbers[left];
			numbers[left] = numbers[right];
			numbers[right] = temp;

			System.out.println("numbers with left: " + left + ", right: " + right + ": " + Arrays.toString(numbers));

			left++;
			right--;
		}
	}
}
