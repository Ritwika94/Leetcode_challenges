package com.leetcode.august.Challenges;

import java.util.Arrays;

public class HIndex {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		System.out.println(hIndex(citations));

	}
	 public static int hIndex(int[] citations) {
         Arrays.sort(citations); 
         int res=0;
        for(int i=citations.length-1;i>=0;i--)
        {
            int count=citations.length-i;
            if(citations[i]>=count)
                res=count;
            else
                break;
        }
        return res;
        
    }

}
