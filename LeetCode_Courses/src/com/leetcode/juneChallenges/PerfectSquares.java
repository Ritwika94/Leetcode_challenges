package com.leetcode.juneChallenges;

public class PerfectSquares {

	public static void main(String[] args) {
		//12=4+4+4
		//7=4+1+1+1
		System.out.println(numSquares(7));
	}
	 public static int numSquares(int n) {
	        if(n==1)
	            return 1;
	        if(n==2)
	            return 2;
	        if(n==3)
	            return 3;
	        int dp[]=new int[n+1];
	        dp[0]=0;
	        dp[1]=1;
	        dp[2]=2;
	        dp[3]=3;
	       
	        for(int i=4;i<=n;i++)
	        {
	            dp[i]=i;
	            for(int j=1;j<=Math.ceil(Math.sqrt(i));j++)
	            {
	                int temp=j*j;
	                if(temp>i)
	                    break;
	                else
	                    
	                   dp[i]=Math.min(dp[i],1+dp[i-temp]);
	            }
	        }
	        
	        return dp[n];
	        
	    }

}
