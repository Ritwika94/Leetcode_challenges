package com.leetcode.december.Challenges;

public class RemoveDuplicatesFromSortedArrayII {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2,2,3,3,3};
		System.out.println(removeDuplicates(nums));

	}
	 public static int removeDuplicates(int[] nums) {
	        int n=nums.length;
	        if(nums==null)
	            return 0;
	        if(n<=2)
	            return n;
	       int i=1;
	       int j=2;
	        
	      while(j<n){
	          if(nums[j]==nums[i] && nums[j]==nums[i-1])
	              j++;
	          else{
	              i++;
	              nums[i]=nums[j];
	              j++;
	          }
	      }
	        
	        return i+1;
	    }

}
