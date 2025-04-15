package javaprograms;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		int n = 5;
		int factorial = 1;
		for (int index = 1; index <= 5; index++) {
			factorial = factorial * index;
		}
		System.out.println("factorial:" + factorial);
	}

}
