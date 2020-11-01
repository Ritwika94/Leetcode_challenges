package com.leetcode.septemberChallenges;

public class SubarrayProductLessThanK {

	public static void main(String[] args) {
		int[] nums= {10, 5, 2, 6};
		int k=100;
		System.out.println(numSubarrayProductLessThanK(nums,k));

	}
	
	 public static int numSubarrayProductLessThanK(int[] nums, int k) {
	       
	        int n=nums.length;
	        int start=0;
	        int end=0;
	        int currProduct=1;
	        int res=0;
	        while(end<n ){
	            currProduct*= nums[end] ;
	            while(currProduct>=k && start < end){
	                currProduct=currProduct/nums[start];
	                start=start+1;
	                
	            }
	             if(currProduct<k ){
	                  int len = end - start + 1; 
	                  res += len; 
	            }
	            end++;
	        }
	       
	        return res;
	        
	    }

}
