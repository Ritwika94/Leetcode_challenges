package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KDiffPairsInAnArray {

	public static void main(String[] args) {
		int[] nums= {3,1,4,1,5};
		int k=2;
		System.out.println(findPairs(nums,k));

	}
	 public static int findPairs(int[] nums, int k) {  if(nums==null || nums.length==1 || k<0)
         return 0;
	int count=0;
     HashMap<Integer,Integer> hmap=new HashMap();
     for(int num:nums)
          hmap.put(num, hmap.getOrDefault(num, 0)+1);
      for (int key : hmap.keySet()) {
          if(k==0){
              if(hmap.get(key)>1)
                  count++;
          }
          else{
              if(hmap.containsKey(key+k))
              count++;
          }
              
      }
     return count;}
}
