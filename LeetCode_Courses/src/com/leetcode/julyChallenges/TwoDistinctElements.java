package com.leetcode.julyChallenges;

public class TwoDistinctElements {

	public static void main(String[] args) {
		int[] nums= {1,2,1,3,2,5};
		singleNumber(nums);

	}
	  public static int[] singleNumber(int[] nums) {
	        int xor_res=0;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	           xor_res= xor_res^nums[i];  
	        }
	        
	        int setBit=xor_res & ~(xor_res -1);
	        int x=0;
	        int y=0;
	        
	          for(int i=0;i<nums.length;i++)
	          {
	              if((setBit & nums[i])>0)
	                  x=x^nums[i];
	              else
	                  y=y^nums[i];
	           }
	       
	        int arr[]={x,y};
	        return arr;
	        
	        
	    }

}
