package javaprograms;

public class SwapWithoutThridVariable {

	public static void main(String[] args) {

		int first = 10;
		int second = 5;

		first = first + second; // 15
		second = first - second; // 10;
		first = first - second; // 5

		System.out.println("first:" + first);
		System.out.println("second:" + second);

	}

}
