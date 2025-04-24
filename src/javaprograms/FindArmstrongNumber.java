package javaprograms;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		if (isArmstrong(number)) {
			System.out.println(number + " is an armstrong number.");
		} else {
			System.out.println(number + " is not an armstrong number.");
		}
	}

	private static boolean isArmstrong(int number) {
		int actual = number;
		int armStrong = 0;
		System.out.println("actual:" + actual);
		while (number > 0) {
			int lastDigit = number % 10;
			// armStrong = armStrong + (lastDigit * lastDigit * lastDigit);
			armStrong = armStrong + (int) Math.pow(lastDigit, 3);
			number = number / 10;
		}
		System.out.println("armStrong:" + armStrong);
		return actual == armStrong;
	}
}
