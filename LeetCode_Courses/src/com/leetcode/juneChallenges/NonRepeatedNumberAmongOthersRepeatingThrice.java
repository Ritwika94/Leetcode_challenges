package com.leetcode.juneChallenges;

public class NonRepeatedNumberAmongOthersRepeatingThrice {

	public static void main(String[] args) {
		int[] nums= {1,2,1,2,9,1,2};
		
		System.out.println(singleNumber(nums));

	}
	 public static int singleNumber(int[] nums) {
	        int ones=0;
	        int twos=0;
	        int threes;
	        for(int i=0;i<nums.length;i++)
	        {
	            twos  |=(ones&nums[i]);
	            ones ^=nums[i];
	            threes=~(ones&twos);
	            ones &=threes;
	            twos &=threes;
	      }
	        return ones;
	        
	        
	    }
}
