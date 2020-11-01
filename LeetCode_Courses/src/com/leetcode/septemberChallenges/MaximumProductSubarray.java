package com.leetcode.septemberChallenges;

public class MaximumProductSubarray {

	public static void main(String[] args) {
		int[] nums = {0,2};
		System.out.println(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) {
		int n=nums.length;
		int max[]=new int[n];
		int min[]=new int[n];
		int result=nums[0];
		max[0]=min[0]=nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>0) {
				max[i]=Math.max(nums[i],max[i-1]*nums[i]);
				min[i]=Math.min(nums[i],min[i-1]*nums[i]);
			}
			else {
				max[i]=Math.max(nums[i],min[i-1]*nums[i]);
				min[i]=Math.min(nums[i],max[i-1]*nums[i]);
			}
			result=Math.max(result, max[i]);
		}
		return result;
		
	}

}
