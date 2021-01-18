package com.leetcode.december.Challenges;

public class BurstBalloons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int maxCoins(int[] nums) {
	        int n=nums.length;
	        int b[]=new int[n+2];
	        b[0]=b[n+1]=1;
	        
	        for(int i=1;i<=n;i++)
	            b[i]=nums[i-1];
	        int dp[][]=new int[n+2][n+2];
	        
	        for(int l=1;l<=n;l++){
	            for(int left=1;left<n-l+2;left++){
	                int right=left+l-1;
	                for(int last=left;last<=right;last++){
	                    dp[left][right]=Math.max(dp[left][right],dp[left][last-1]+b[left-1]*b[last]*b[right+1]+dp[last+1]                                           [right]);
	                }
	            }
	        }
	        
	        return dp[1][n];
	    }

}
