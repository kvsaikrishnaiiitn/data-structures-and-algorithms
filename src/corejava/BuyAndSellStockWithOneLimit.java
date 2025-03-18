package corejava;

public class BuyAndSellStockWithOneLimit {

	public static void main(String[] args) {
		int[] numbers = { 7, 1, 5, 3, 6, 4 };

		int min = numbers[0];
		int maxProfit = 0;

		for (int index = 1; index < numbers.length; index++) {
			min = Math.min(min, numbers[index]);
			maxProfit = Math.max(maxProfit, numbers[index] - min);

			System.out.println("min:" + min);
			System.out.println("maxProfit:" + maxProfit);
		}

		System.out.println(maxProfit);
	}

}
