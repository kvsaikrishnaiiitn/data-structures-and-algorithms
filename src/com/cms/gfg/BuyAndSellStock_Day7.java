package com.cms.gfg;

public class BuyAndSellStock_Day7 {

	public static void main(String[] args) {

		int prices[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = prices.length;

		/**
		 * Algo: Local Minima and Local Maxima
		 */
		int lMin = prices[0];
		int lMax = prices[0];
		int maxProfit = 0;

		for (int index = 0; index < n - 1; index++) {
			while (index < n - 1 && prices[index] >= prices[index + 1]) {
				index++;
			}
			lMin = prices[index];
			//System.out.println("BuyAndSellStock_Day7.main()...lMin:" + lMin);

			while (index < n - 1 && prices[index] <= prices[index + 1]) {
				index++;
			}
			lMax = prices[index];
			//System.out.println("BuyAndSellStock_Day7.main()...lMax:" + lMax);

			maxProfit += (lMax - lMin);
		}
		System.out.println("BuyAndSellStock_Day7.main()...maxProfit:" + maxProfit);

		/**
		 * Algo: Immediate profit
		 */
		maxProfit = 0;
		for (int index = 0; index < n - 1; index++) {
			if (prices[index] < prices[index + 1]) {
				maxProfit += (prices[index + 1] - prices[index]);
			}
		}
		System.out.println("BuyAndSellStock_Day7.main()...maxProfit:" + maxProfit);

	}

}
