package corejava;

public class BuyAndSellStockWithNoLimit {

	public static void main(String[] args) {
		int[] numbers = { 100, 180, 260, 310, 40, 435, 695 };
		int profit = 0;
		for (int index = 1; index < numbers.length; index++) {
			if (numbers[index] > numbers[index - 1]) {
				profit += (numbers[index] - numbers[index - 1]);
			}
		}
		System.out.println(profit);
	}

}
