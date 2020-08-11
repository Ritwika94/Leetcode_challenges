package com.leetcode.juneChallenges;

public class Dungeon_Game {

	public static void main(String[] args) {
		int[][] arr= {{-2,-3,3},
				{-5,-10,1},
				{10,30,-5}
			};
		System.out.println(calculateMinimumHP(arr));

	}
	 public static int calculateMinimumHP(int[][] dungeon) {
		 int m=dungeon.length;
		 int n=dungeon[0].length;
		 int dp[][] = new int[m][n]; 
	     
	       
	        dp[m-1][n-1] = dungeon[m-1][n-1] > 0? 1: 
	                       Math.abs(dungeon[m-1][n-1]) + 1; 
	       
	        for (int i = m-2; i >= 0; i--) 
	             dp[i][n-1] = Math.max(dp[i+1][n-1] - dungeon[i][n-1], 1); 
	        for (int j = n-2; j >= 0; j--) 
	             dp[m-1][j] = Math.max(dp[m-1][j+1] - dungeon[m-1][j], 1); 
	       
	      
	        for (int i=m-2; i>=0; i--) 
	        { 
	            for (int j=n-2; j>=0; j--) 
	            { 
	                int min_dungeon_on_exit = Math.min(dp[i+1][j], dp[i][j+1]); 
	                dp[i][j] = Math.max(min_dungeon_on_exit - dungeon[i][j], 1); 
	            } 
	         } 
	       
	         return dp[0][0]; 
	        
	    }
	
}
