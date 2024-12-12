package com.cms.gfg;

public class BuyAndSellStock_OneTime_Day8 {

	public static void main(String[] args) {

		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int n = prices.length;

		int maxProfit = 0;
		int min = prices[0];

		for (int index = 1; index < n; index++) {
			if (prices[index] < min) {
				min = prices[index];
			}
			if (prices[index] - min > maxProfit) {
				maxProfit = prices[index] - min;
			}
		}
		System.out.println("BuyAndSellStock_OneTime_Day8.main()...maxProfit:" + maxProfit);
	}

}
