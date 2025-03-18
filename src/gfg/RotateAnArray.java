package gfg;

import java.util.Arrays;

public class RotateAnArray {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int d = 2;

		int n = numbers.length;
		d %= n;

		rotateArray(numbers, d);

	}

	private static void rotateArray(int[] numbers, int d) {
		reverseArray(numbers, 0, d - 1);
		System.out.println(Arrays.toString(numbers));
		reverseArray(numbers, d, numbers.length - 1);
		System.out.println(Arrays.toString(numbers));
		reverseArray(numbers, 0, numbers.length - 1);
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
