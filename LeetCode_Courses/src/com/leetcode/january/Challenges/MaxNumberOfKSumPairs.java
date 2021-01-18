package com.leetcode.january.Challenges;

import java.util.HashMap;

public class MaxNumberOfKSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxOperations(int[] nums, int k) {
	       HashMap<Integer,Integer> hmap=new HashMap();
	        for(int x:nums)
	          hmap.put(x,hmap.getOrDefault(x,0)+1);
	        int count=0;
	       for(int i=0;i<nums.length;i++){
	           if(hmap.containsKey(k-nums[i])){
	               if(nums[i]!= Math.abs(nums[i]-k) && hmap.get(k-nums[i])>0 && hmap.get(nums[i])>0){
	                   hmap.put(nums[i],hmap.get(nums[i])-1);
	                    hmap.put(k-nums[i],hmap.get(k-nums[i])-1);
	                    count++;
	               }
	                if(nums[i]== (k-nums[i]) && hmap.get(nums[i])>=2){
	                    hmap.put(nums[i],hmap.get(nums[i])-2);
	                   
	                    count++;
	                }
	               
	           }
	       }
	        return count;                    
	                            
	    }

}
