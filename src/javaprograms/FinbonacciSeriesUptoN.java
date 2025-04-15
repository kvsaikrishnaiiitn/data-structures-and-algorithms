package javaprograms;

public class FinbonacciSeriesUptoN {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int next;

		int n = 6;
		for (int i = 0; i <= n; i++) {
			System.out.println(first);
			next = first + second;// next=1
			first = second;
			second = next;
		}
	}
}
