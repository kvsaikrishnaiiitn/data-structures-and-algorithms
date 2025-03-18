package gfg;

public class SecondLargestElement {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 5, 5, 4 };

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		if (numbers.length < 2) {
			secondLargest = -1;
		} else {

			int length = numbers.length;
			for (int index = 0; index < length; index++) {
				if (numbers[index] > largest) {
					secondLargest = largest;
					largest = numbers[index];
				} else if (numbers[index] > secondLargest && numbers[index] < largest) {
					secondLargest = numbers[index];
				}
			}
		}
		System.out.println("SecondLargestElement.main()...largest:" + largest);
		System.out.println("SecondLargestElement.main()...secondLargest:" + secondLargest);

	}
}
