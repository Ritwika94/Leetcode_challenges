package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.List;

public class FindingDuplicates {

	public static void main(String[] args) {
		
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer> list=findDuplicates(nums);
		for(Integer i:list)
			System.out.println(i);
	}
	 public static List<Integer> findDuplicates(int[] nums) {
	        int len=nums.length;
	         List<Integer> list=new ArrayList<Integer>();
	        for(int i=0;i<len;i++)
	        {
	            if(nums[Math.abs(nums[i])-1]>=0)
	                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
	            else
	                list.add(Math.abs(nums[i]));
	         }
	        return list;
	        
	    }

}
