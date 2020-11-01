package com.leetcode.october.Challenges;

public class BuyAndSellStockWithAtMostKTransactions {

	public static void main(String[] args) {
		int[] price= {3,2,6,5,0,3};
		int k=2;
		System.out.println(maxProfit(k,price));

	}
	 public static int maxProfit(int k, int[] prices) {
			if (prices.length < 2 || k <= 0)
			    return 0;
	        int n = prices.length;
	         if (k>n/2)
	        {
	            int res = 0;
	            for (int i = 1; i < n; i ++)
	            {
	                res += Math.max(0,prices[i]-prices[i-1]);
	            }
	            return res;
	        }
			int T[][]=new int[k+1][n+1];
			for(int i=0;i<=k;i++)
				T[i][0]=0;
			for(int i=0;i<=n;i++)
				T[0][i]=0;
			
			for(int i=1;i<=k;i++)
			{
	            int max_so_far=Integer.MIN_VALUE; 
				for(int j=1;j<n;j++)
				{
					max_so_far=Math.max(max_so_far, T[i-1][j-1]-prices[j-1]);
					T[i][j]=Math.max(T[i][j-1],max_so_far+prices[j]);
					
				}
			}
			
			return T[k][n-1];
			
		
	        
	    }

}
