package com.leetcode.october.Challenges;

import java.util.TreeSet;

public class Pattern132 {

	public static void main(String[] args) {
		int[] nums= {3,1,4,2};
		System.out.println(find132pattern(nums));

	}
	 public static boolean find132pattern(int[] nums) {
	     int smaller[]=nums.clone();
	        int n=nums.length;
	     for(int i=1;i<n;i++){
	         smaller[i]=Math.min( smaller[i], smaller[i-1]);
	     }
	        TreeSet<Integer> set1=new TreeSet();
	        for(int i=n-1;i>0;i--){
	            if (set1.lower(nums[i]) != null){
	            int r=set1.lower(nums[i]);
	            int l=smaller[i-1];
	            if(l<r)
	               return true;
	            }
	                
	           
	            set1.add(nums[i]);
	            
	        }
	       return false;
	       
	    }

}
