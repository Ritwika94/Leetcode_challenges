package com.leetcode.august.Challenges;

import java.util.ArrayList;
//at most 2 transactions allowed
public class MaximumProfitByBuyAndSellStock {

	public static void main(String[] args) {
		int[] prices = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(prices));

	}
	 public static int maxProfit(int[] prices) {
		   if(prices == null || prices.length < 2) return 0;
		      int n=prices.length;
				 int profit[]=new int[n];
				 int profit1[]=new int[n];
				 for (int i=0; i<n; i++) 
			            profit[i] = 0; 
				 int maxprice=prices[n-1];
				 for(int i=prices.length-2;i>=0;i--)
				 {
					 if(prices[i]>maxprice)
						 maxprice=prices[i];
					 
					 profit[i]=Math.max(profit[i+1], maxprice-prices[i]);
				 }
				 int minprice=prices[0];
				 for(int i=1;i<n;i++)
				 {
					 if(prices[i]<minprice)
						 minprice=prices[i];
					 
					 profit1[i]=Math.max(profit1[i-1], (prices[i]-minprice));
				 }
				 int max=0;
				 for(int i = 0; i < prices.length; i++){
		             System.out.println(profit1[i] + profit[i]);
			            max = Math.max(max, profit1[i] + profit[i]);
			        }
				 
				 return max;
				 
			       
			 }
}
