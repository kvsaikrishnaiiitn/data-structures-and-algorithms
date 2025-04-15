package javaprograms;

public class PrimeOrNot {
	public static void main(String[] args) {
		int n = 13;
		if (findPrimeOrNot(n)) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}

	private static boolean findPrimeOrNot(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
