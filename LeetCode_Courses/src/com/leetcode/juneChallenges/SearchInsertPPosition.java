package com.leetcode.juneChallenges;

public class SearchInsertPPosition {

	public static void main(String[] args) {
		/*
		 * Input: [1,3,5,6], 5 Output: 2
		 */
	}
	public int searchInsert(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if (nums[mid]==target)
                return mid;
            
            if(nums[mid]<target)
               l=mid+1;
            else
                h=mid-1;
                
         }
        return l;
        
    }
}
