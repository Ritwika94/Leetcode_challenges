package com.leetcode.december.Challenges;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums= {-7,-3,2,3,11};
		sortedSquares(nums);

	}
	  public static int[] sortedSquares(int[] nums) {
	         int n = nums.length, left = 0, 
	        right = n - 1;
	     
	    int result[] = new int[n];
	     
	    for(int index = n - 1; index >= 0; index--)
	    {
	        if (Math.abs(nums[left]) > nums[right])
	        {
	            result[index] = nums[left] * nums[left];
	            left++;
	        }
	        else
	        {
	            result[index] = nums[right] * nums[right];
	            right--;
	        }
	    }
	    return result;
	}

}
