package com.leetcode.august.Challenges;

public class BuyAndStockWithMultipleTransactions {

	public static void main(String[] args) {
		int[] prices= {5, 1, 2, 3, 4};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
		int profit=0;
		int diff=0;
		for(int i=1;i<prices.length;i++)
		{
			diff=prices[i]-prices[i-1];
			if(diff>0)
				profit+=diff;
		}
	  return profit;
	}
}
