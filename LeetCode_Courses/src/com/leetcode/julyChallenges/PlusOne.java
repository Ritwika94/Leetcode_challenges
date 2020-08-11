package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] plusOne(int[] digits) {
	        int num=0;
	        List<Integer> al=new ArrayList();
	        int len=digits.length;
	        for(int i=0;i<len;i++)
	        {
	           al.add(digits[i]);
	        }
	       
	        int index=-1;
	         for(int i=0;i<len;i++)
	        {
	          if(digits[i]<9)
	              index=i;
	        }
	         int val=digits[len-1]+1;
	         if(val>9)
	         {
	             
	             int c=al.get(len-1);
	             al.set(len-1,c%9);
	         
	           if(index==-1)
	            {
	             al.add(0,1);
	             index=1;
	           }
	         for(int i=index;i<al.size()-1;i++)
	         {
	             al.set(i,(al.get(i)+1)%10);
	          }
	          digits=al.stream().mapToInt(Integer::intValue)
								.toArray();
	             
	         }
	        else
	            digits[len-1]=val;
	        
	      return digits; 
	       
	    }

}
