package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> threeSum(int[] nums) {
		 Arrays.sort(nums); 
		  
	        List<List<Integer> > pair = new ArrayList<>(); 
	        TreeSet<String> set = new TreeSet<String>(); 
	        List<Integer> triplets = new ArrayList<>(); 
	  
	        for (int i = 0; i < nums.length - 2; i++) { 
	  
	            int j = i + 1; 
	  
	            int k = nums.length - 1; 
	  
	            while (j < k) { 
	  
	                if (nums[i] + nums[j] + nums[k] == 0) { 
	  
	                    String str = nums[i] + ":" + nums[j] + ":" + nums[k]; 
	  
	                    if (!set.contains(str)) { 
	  
	                         
	                        triplets.add(nums[i]); 
	                        triplets.add(nums[j]); 
	                        triplets.add(nums[k]); 
	                        pair.add(triplets); 
	                        triplets = new ArrayList<>(); 
	                        set.add(str); 
	                    } 
	  
	                    j++; 
	                    k--; 
	  
	                } else if (nums[i] + nums[j] + nums[k] < 0) 
	                    j++; 
	  
	                else
	                    k--; 
	            } 
	        } 
	        return pair; 
	    } 
}
