package com.leetcode.october.Challenges;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int search(int[] nums, int target) {
	        
	        int h=nums.length-1;
	        int l=0;
	        
	        while(l<=h){
	            int mid=l+(h-l)/2;
	            
	            if(nums[mid]==target)
	                return mid;
	            
	            if(nums[mid]<target)
	                l=mid+1;
	            else
	                h=mid-1;
	                
	        }
	        return -1;
	        
	        
	    }

}
