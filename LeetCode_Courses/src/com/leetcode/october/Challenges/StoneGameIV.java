package com.leetcode.october.Challenges;

public class StoneGameIV {

	public static void main(String[] args) {
	System.out.println(winnerSquareGame(6));
	System.out.println(winnerSquareGame(17));

	}
	 public static boolean winnerSquareGame(int n) {
	        boolean dp[]=new boolean[n+1];
	        for(int i=0;i<=n;i++){
	            dp[i]=false;
	        }
	        for(int i=1;i<=n;i++){
	              for(int j=1;j*j<=i;j++){
	                  if(dp[i-j*j]==false)
	                  {
	                      dp[i]=true;
	                      break;
	                  }
	              }
	        }
	        return dp[n];
	        
	    }

}
