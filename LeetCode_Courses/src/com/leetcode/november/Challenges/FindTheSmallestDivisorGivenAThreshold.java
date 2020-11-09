package com.leetcode.november.Challenges;

public class FindTheSmallestDivisorGivenAThreshold {

	public static void main(String[] args) {
		int[] nums = {2,3,5,7,11};
		int threshold = 11;
		System.out.println(smallestDivisor(nums,threshold));

	}
	public static int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
            max=Math.max(max,x);
        }
        int h=max;
        int mid=0;
        while(l<h){
            mid=l+(h-l)/2;
            
            int sum=0;
            for(int x:nums){
               int temp=x/mid;
                sum+=(x%mid==0)?temp:temp+1;
            }
            
            if(sum>threshold)
                l=mid+1;
            else{
                h=mid;
               
            }
               
        }
        return l;
    }

}
