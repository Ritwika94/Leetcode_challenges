package com.leetcode.juneChallenges;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] nums= {1,3,5,6,7,8,5,9,2};
		System.out.println(findDuplicate(nums));

	}
	
	 public static int findDuplicate(int[] nums) {
         int n=nums.length;
       
        for(int i=0;i<n;i++)
        
           nums[nums[i]%n]+=n;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=n*2)
                return i;
         }
        return 0;
        
    }

}
