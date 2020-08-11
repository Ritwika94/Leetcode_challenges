package com.leetcode.mayChallenges;

import java.util.HashMap;

public class MaxContiguousArraywithequalZerosandOnes {

	public static void main(String[] args) {
		
		int[] A= {0,1,0};
		System.out.println(findMaxLength(A));
	}
	
	 public static int findMaxLength(int[] nums) {
		 
		 for(int i=0;i<nums.length;i++)
			 nums[i]=nums[i]==0?-1:+1;
		 HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
		 int sum=0;
		 int maxlen=Integer.MIN_VALUE;
		 int end=0;
		 for(int i=0;i<nums.length;i++)
		 {
			 sum+=nums[i];
			 if(sum==0)
			 {
				 maxlen=i+1;
				 end=i;
			 }
			 if(hmap.containsKey(sum))
			 {
				 if(maxlen<i-hmap.get(sum))
				 {
					 maxlen=sum;
					 end=i;
				 }
			 }
			 else
				 hmap.put(sum, i);
		 }
		 if(maxlen==Integer.MIN_VALUE)
             return 0;
        
		return maxlen;
	        
	    }

}
