package com.leetcode.august.Challenges;

public class BuyAndStockWithAtMostKTransactions {

	public static void main(String[] args) {
		int[] price= {10, 22, 5, 75, 65, 80 };
		int k=2;
		System.out.println(maxProfit(price,k));
	}
	public static int maxProfit(int[] price,int k)
	{
		int n=price.length;
		int T[][]=new int[k+1][n+1];
		for(int i=0;i<=k;i++)
			T[i][0]=0;
		for(int i=0;i<=n;i++)
			T[0][i]=0;
		
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<n;j++)
			{
				int max_so_far=0;
				for(int m=0;m<j;m++)
				{
					max_so_far=Math.max(max_so_far, (price[j]-price[m])+T[i-1][m]);
					T[i][j]=Math.max(max_so_far,T[i][j-1]);
				}
			}
		}
		
		return T[k][n-1];
		
	}
            


}
