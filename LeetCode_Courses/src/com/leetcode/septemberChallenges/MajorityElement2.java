package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

	public static void main(String[] args) {
		int[] nums= {1,1,1,3,3,2,2,2};
		majorityElement(nums);

	}
	public static List<Integer> majorityElement(int[] nums) {
        Integer candidate1=null;
        Integer candidate2=null;
        int count1=0;
        int count2=0;
        int n=nums.length;
        List<Integer> list=new ArrayList();
       for(int num:nums){
           if(candidate1!=null && candidate1==num){
               count1++;
           }
           else if(candidate2!=null && candidate2==num){
               count2++;
           }
           else if(count1==0){
               candidate1=num;
               count1=1;
           }
            else if(count2==0){
               candidate2=num;
               count2=1;
           }
           else{
               count1--;
               count2--;
           }
       }
        count1=0;
        count2=0;
         for(int num:nums){
             if(candidate1!=null && candidate1==num)
                 count1++;
              if(candidate2!=null && candidate2==num)
                 count2++;
             
         }
        if(count1>n/3)
            list.add(candidate1);
       if(count2>n/3)
           list.add(candidate2);
        return list;
             
        
    }

}
