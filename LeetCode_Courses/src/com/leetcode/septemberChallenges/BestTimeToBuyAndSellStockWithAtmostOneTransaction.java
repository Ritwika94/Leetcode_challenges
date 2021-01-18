package com.leetcode.septemberChallenges;

public class BestTimeToBuyAndSellStockWithAtmostOneTransaction {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}
	public static int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
      int n=prices.length;
      int max[]=new int[n];
      int min[]=new int[n];
     
      int minPrice=prices[0];
      int maxPrice=prices[n-1];
      min[0]=minPrice;
      for(int i=1;i<n;i++){
          if(prices[i]<minPrice)
              minPrice=prices[i];
          min[i]=Math.min(minPrice,prices[i]);
      }
       max[n-1]=maxPrice;
      for(int i=n-2;i>=0;i--){
          if(prices[i]>maxPrice)
              maxPrice=prices[i];
          max[i]=Math.max(maxPrice,prices[i]);
      }
      int maxVal=0;
       for(int i=0;i<n;i++){
           maxVal=Math.max(maxVal,(max[i]-min[i]));
       }
      return maxVal;
    
  }

}
