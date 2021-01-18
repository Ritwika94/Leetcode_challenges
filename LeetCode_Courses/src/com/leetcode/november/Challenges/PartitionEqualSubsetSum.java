package com.leetcode.november.Challenges;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		int[] nums= {1,5,11,5};
		System.out.println(canPartition(nums));

	}
	public static boolean canPartition(int[] nums) {
	     
        int n=0;
        for(int x:nums)
            n+=x;
        if(n%2==1)
            return false;
        n=n/2;
        boolean T[][]=new boolean[nums.length+1][n+1];
         for(int i=0;i<=nums.length;i++)
            T[i][0]=true;
        for(int i=1;i<=n;i++)
            T[0][i]=false;
        
        for(int i=1;i<=nums.length;i++){
             for(int j=1;j<=n;j++){
               
               if(j<nums[i-1])
                  T[i][j]=T[i-1][j];
                 if(j>=nums[i-1])
                 T[i][j]=T[i-1][j]||T[i-1][j-nums[i-1]];
            }
                 
           
        }
      return T[nums.length][n];
    }

}
