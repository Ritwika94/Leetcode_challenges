package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestKDivisibleSet {

	public static void main(String[] args) {
		/*
		 * Input: [1,2,3] Output: [1,2] (of course, [1,3] will also be ok)
		 */

	}
	public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list=new  ArrayList();
        if(nums.length == 0)
        {
             
             return list;
        }
         Arrays.sort(nums);
        int n=nums.length;
        int count[] = new int[n];  
        int prev[] = new int[n];  
        Arrays.fill(count,1);
         Arrays.fill(prev,-1);
         int max_ind = 0;   
        for(int i=0;i<nums.length;i++)
        {
              for(int j=i-1;j>=0;j--)
              {
                   if(nums[i] % nums[j] == 0 &&  count[i]<count[j]+1)
                   {
                       count[i]=count[j]+1;
                       prev[i]=j;
                    }
             }
            if (count[i] > count[max_ind])
            {  
               
                max_ind= i;  
            }       
                      
                      
         }
        int k = max_ind;  
       
          while(k>=0)
          {
              list.add(nums[k]);
              k=prev[k];
          }
        return list;
        
    }

}
