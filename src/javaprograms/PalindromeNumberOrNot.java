package javaprograms;

public class PalindromeNumberOrNot {

	public static void main(String[] args) {

		int number = 12321;
		int actual = number;
		int reverseNumber = 0;
		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}

		if (actual == reverseNumber) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
	}

}
