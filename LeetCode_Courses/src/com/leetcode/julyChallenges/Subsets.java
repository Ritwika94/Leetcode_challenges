package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		subsets(nums);

	}
	 public static List<List<Integer>> subsets(int[] nums) {
	        int n=nums.length;
	        List<List<Integer>>  al=new ArrayList();
	        for(int i=0;i<(1<<n);i++)
	        {
	            List<Integer> list=new ArrayList();
	            for(int j=0;j<n;j++)
	            {
	                if((i & (1<<j))>0)
	                    list.add(nums[j]);
	             }
	          al.add(list) ;
	        }
	        
	        return al;
	    }

}
