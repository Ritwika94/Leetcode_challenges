package com.leetcode.august.Challenges;

public class MinimumCostOfTickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int mincostTickets(int[] days, int[] costs) {
	       int week=0;
	       int month=0;
	        int dp[]=new int[days.length+1];
	        int temp=0;
	        for(int i=0;i<days.length;i++)
	        {
	            while(days[week]<days[i]-6)
	                week++;
	             while(days[month]<days[i]-29)
	                month++;
	            temp=Math.min(dp[i]+costs[0],dp[week]+costs[1]);
	            dp[i+1]=Math.min(temp,dp[month]+costs[2]);
	            
	          }
	        
	        return dp[days.length];
	        
	        
	    }

}
