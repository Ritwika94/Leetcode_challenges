package com.leetcode.septemberChallenges;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		System.out.println(rob(nums));

	}
	public static int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
            return 0;
        int maxAmount[]=new int[n+1];
        maxAmount[0]=0;
        maxAmount[1]=nums[0];
        for(int i=2;i<=n;i++){
            maxAmount[i]=Math.max( maxAmount[i-1],nums[i-1]+ maxAmount[i-2]);
        }
        
       return maxAmount[n];
        
    }

}
