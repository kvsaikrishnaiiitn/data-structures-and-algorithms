package javaprograms;

public class ReverseANumber {

	public static void main(String[] args) {
		int number = 123;
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("reverseNumber:" + reverseNumber);
	}

}
