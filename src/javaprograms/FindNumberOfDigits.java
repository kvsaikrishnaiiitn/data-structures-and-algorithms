package javaprograms;

public class FindNumberOfDigits {

	public static void main(String[] args) {
		int number = -12;
		int numberOfDigits = 0;

		if (number < 0) {
			number = -1 * number;
		} else if (number == 0) {
			number = 1;
		}

		while (number > 0) {
			numberOfDigits++;
			number /= 10;
		}

		System.out.println("numberOfDigits:" + numberOfDigits);
	}
}
