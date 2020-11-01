package com.leetcode.october.Challenges;

public class HouseRobberII {

	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		System.out.println(rob(nums));

	}
	public static int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
            return nums[0];
        int maxAmount[]=new int[n];
        maxAmount[0]=0;
        maxAmount[1]=nums[0];
        for(int i=2;i<=n-1;i++){
            maxAmount[i]=Math.max( maxAmount[i-1],nums[i-1]+ maxAmount[i-2]);
        }
        int x=maxAmount[n-1];
        
        maxAmount[0]=0;
        maxAmount[1]=nums[1];
        int j=3;
        for(int i=2;i<=n-1;i++){
            maxAmount[i]=Math.max( maxAmount[i-1],nums[j-1]+ maxAmount[i-2]);
            j++;
        }
        int y=maxAmount[n-1];
        
        int res=Math.max(x,y);
        return res;
        
     
    }

}
