package com.leetcode.juneChallenges;

public class H_II_Index {

	public static void main(String[] args) {
		
		int[] citations= {11,15};
		System.out.println(hIndex(citations));

	}
	
	public static int hIndex(int[] citations) {
        int l=0;
        int h=citations.length-1;
        int mid = 0;
        while(l<=h)
        {
        	mid=l+(h-l)/2;
        	if(citations[mid]==citations.length-mid)
        		return citations.length-mid;
        	else if(citations[mid]<citations.length-mid)
        		l=mid+1;
        	else
        		h=mid-1;
        }
        return citations.length-mid;
       
   }

}
