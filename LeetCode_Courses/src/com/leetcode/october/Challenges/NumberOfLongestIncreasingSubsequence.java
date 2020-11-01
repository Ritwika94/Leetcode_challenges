package com.leetcode.october.Challenges;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {

	public static void main(String[] args) {
		System.out.println(findNumberOfLIS(new int[] {1,3,5,4,7}));
		System.out.println(findNumberOfLIS(new int[] {2,2,2,2,2}));

	}
	 public static int findNumberOfLIS(int[] nums) {
	        int n=nums.length;
	        
	        int dp[]=new int[n];
	        int count[]=new int[n];
	        Arrays.fill(dp,1);
	        Arrays.fill(count,1);
	     
	        int lis=1;
	        for(int i=1;i<n;i++){
	            for(int j=0;j<i;j++){
	                if(nums[j]<nums[i]){
	                    if((dp[j]+1)>dp[i]){
	                        dp[i]=dp[j]+1;
	                        count[i]=count[j];
	                    }
	                   else if(dp[j]+1==dp[i])
	                          count[i]+=count[j];
	                }
	            }
	            lis=Math.max(lis,dp[i]);
	        }
	       
	        int res=0;
	        for(int i=0;i<n;i++){
	            if(dp[i]==lis)
	                res+=count[i];
	        }
	        return res;
	        
	    }

}
