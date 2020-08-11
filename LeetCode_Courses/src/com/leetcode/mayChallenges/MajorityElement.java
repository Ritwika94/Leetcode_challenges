package com.leetcode.mayChallenges;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int a[]= {3,2,3};
		System.out.println(majorityElement(a));

	}
public static int majorityElement(int[] nums) {
	
	HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
	   for(int i=0;i<nums.length;i++)
	   {
		   if(hmap.containsKey(nums[i]))
		   {
			   hmap.put(nums[i], hmap.get(nums[i])+1);
		   }
		   else
		   {
			   hmap.put(nums[i],1);
		   }
	   }
	   
  int majority=0;
  
  for(int i=0;i<nums.length;i++)
	   {
 	 if(hmap.get(nums[i])>Math.floor(nums.length/2))
 	 {
 		majority=nums[i];
 		 break;
 	 }
	   }
  
  
  return majority;
        
    }

}
