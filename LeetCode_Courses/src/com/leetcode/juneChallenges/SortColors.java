package com.leetcode.juneChallenges;

public class SortColors {

	public static void main(String[] args) {
		/*
		 * Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
		 */

	}
	public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        int temp=0;
        while(mid<=h)
        {
            if(nums[mid]==0)
            {
               temp=nums[l];
               nums[l]=nums[mid];
               nums[mid]=temp;
               l++;
               mid++;
             }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
              temp=nums[h];
               nums[h]=nums[mid];
               nums[mid]=temp;
              h--;
            }
               
              
            
       }
        
    }

}
