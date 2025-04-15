package javaprograms;

public class SumOfDigistOfNumber {

	public static void main(String[] args) {

		int number = 124;
		int sumOfDigits = 0;
		while (number > 0) {
			sumOfDigits += number % 10;
			number /= 10;
		}
		System.out.println(sumOfDigits);
	}

}
