package com.leetcode.november.Challenges;
/**
 * 
 * 
Given an array consisting of n integers, find the contiguous subarray
whose length is greater than or equal to k that has the maximum average value.
And you need to output the maximum average value.

(nums[i]+nums[i+1]+…+nums[j])/(j-i+1)>x
=>nums[i]+nums[i+1]+…+nums[j]>x*(j-i+1)
=>(nums[i]-x)+(nums[i+1]-x)+…+(nums[j]-x)>0
 *
 */
public class MaximumAverageSubarrayII {

	public static void main(String[] args) {
		int[] nums= {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(findMaxAverage(nums,k));

	}
	   public static double findMaxAverage(int[] nums, int k) {
		   if(nums.length==0 || nums==null)
			   return 0;
		int n=nums.length;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			min=Math.min(min, nums[i]);
			max=Math.max(max, nums[i]);
		}
		double maxAvg=max;
		double start=min;
		double end=max;
		while(end-start> 1e-5) {
			maxAvg=start+(end-start)/2.0;
			if(checkAverageSumGreaterThanEqualToK(nums,k,maxAvg))
				start=maxAvg;
			else
				end=maxAvg;
		}
		
		return maxAvg;
	   }
	private static boolean checkAverageSumGreaterThanEqualToK(int[] nums, int k, double maxAvg) {
		int sum=0;
		int preSum=0;
		int minPreSum=0;
		for(int i=0;i<k;i++) {
			sum+=nums[i]-maxAvg;
			
		}
		if(sum>=0)
			return true;
		for(int i=k;i<nums.length;i++) {
			sum+=nums[i]-maxAvg;
			preSum+=nums[i-k]-maxAvg;
			minPreSum=Math.min(minPreSum, preSum);
			if(sum>=minPreSum)
				return true;
		}
		return false;
	}

}
