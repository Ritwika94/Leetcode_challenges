package com.leetcode.julyChallenges;

public class MaximumProfitInStockBuyAndSellWithCooldown {

	public static void main(String[] args) {
		int[] prices= {1,2,3,0,2};
		System.out.println(maxProfit(prices));
	}
	 public static int maxProfit(int[] prices) {
	       if(prices==null || prices.length<=1)
	           return 0;
	        int b0=-prices[0];
	        int b1=b0;
	        int s0=0; 
	        int s1=0;
	        int s2=0;
	        
	        for(int price:prices)
	        {
	            b0=Math.max(b1,s2-price);
	            s0=Math.max(s1,b1+price);
	            b1=b0;
	            s2=s1;
	            s1=s0;
	        }
	        
	        return s0;
	    }
	 
	

	/*
	 * buy[i]: To make a decision whether to buy at i, we either take a rest, by
	 * just using the old decision at i - 1, or sell at/before i - 2, then buy at i,
	 * We cannot sell at i - 1, then buy at i, because of cooldown. sell[i]: To make
	 * a decision whether to sell at i, we either take a rest, by just using the old
	 * decision at i - 1, or buy at/before i - 1, then sell at i. So we get the
	 * following formula:
	 * 
	 * buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]); sell[i] =
	 * Math.max(sell[i - 1], buy[i - 1] + prices[i]); 3. Optimize to O(1) Space
	 * 
	 * DP solution only depending on i - 1 and i - 2 can be optimized using O(1)
	 * space.
	 * 
	 * Let b2, b1, b0 represent buy[i - 2], buy[i - 1], buy[i] Let s2, s1, s0
	 * represent sell[i - 2], sell[i - 1], sell[i] Then arrays turn into Fibonacci
	 * like recursion:
	 * 
	 * b0 = Math.max(b1, s2 - prices[i]); s0 = Math.max(s1, b1 + prices[i]); 4.
	 * Write Code in 5 Minutes
	 * 
	 * First we define the initial states at i = 0:
	 * 
	 * We can buy. The max profit at i = 0 ending with a buy is -prices[0]. We
	 * cannot sell. The max profit at i = 0 ending with a sell is 0.
	 */



}
