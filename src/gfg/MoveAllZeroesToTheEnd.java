package gfg;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 0, 4, 3, 0, 5, 0 };

		int pointer = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 0) {
				// swap numbers[index] with numbers[pointer]
				int temp = numbers[index];
				numbers[index] = numbers[pointer];
				numbers[pointer] = temp;

				pointer++;
			}
			System.out.println("After index=" + index + " iteration: " + Arrays.toString(numbers));
		}

	}
}
