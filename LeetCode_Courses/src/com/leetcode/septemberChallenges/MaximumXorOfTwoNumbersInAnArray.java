package com.leetcode.septemberChallenges;

import java.util.HashSet;
import java.util.Set;

public class MaximumXorOfTwoNumbersInAnArray {

	public static void main(String[] args) {
		int[] nums= {3,10,5,25,2,8};
		System.out.println(findMaximumXOR(nums));
	}
	public static int findMaximumXOR(int[] nums) {
        int mask=0;
        int temp=0;
        int max = 0;
        Set<Integer> set=new HashSet();
        for(int i=31;i>=0;i--){
            mask=mask|(1<<i);
            
            for(int j=0;j<nums.length;j++){
                set.add(nums[j] & mask);
            }
            temp=max|(1<<i);
            for(int prefix:set){
                if(set.contains(temp^prefix)){
                    max=temp;
                    break;
                }
            }
            set.clear();
        }
      return max;  
    }

}
