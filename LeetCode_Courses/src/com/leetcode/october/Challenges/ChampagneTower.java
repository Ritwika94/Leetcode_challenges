package com.leetcode.october.Challenges;

public class ChampagneTower {

	public static void main(String[] args) {
		System.out.println(champagneTower(100000009, 33,  17));

	}
	 public static double champagneTower(int poured, int query_row, int query_glass) {
	        int row=101;
	        double dp[][]=new double[row][row];
	        dp[0][0]=poured;
	        
	        for(int i=0;i<row-1;i++){
	            for(int j=0;j<=i;j++){
	                if(dp[i][j]>1){
	                    dp[i+1][j]+=(dp[i][j]-1)/2.0;
	                     dp[i+1][j+1]+=(dp[i][j]-1)/2.0;
	                    dp[i][j]=1;
	                }
	                
	            }
	        }
	        return Math.min(1.0,dp[query_row][query_glass]);
	        
	    }
}
