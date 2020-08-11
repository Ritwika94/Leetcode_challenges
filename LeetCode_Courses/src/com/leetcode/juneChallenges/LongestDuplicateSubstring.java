package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.HashSet;

public class LongestDuplicateSubstring {

	public static void main(String[] args) {
		String str="banana";
		System.out.println(longestDupSubstring(str));

	}
	public static String longestDupSubstring(String S) {
		int n=S.length();
		int l=1;
		int r=n;
		while(l!=r)
		{
			int mid=l+(r-l)/2;
			
			if(search(mid,S,n)!=-1)
			{
				l=mid+1;
				
			}
				
			else
			{
				r=mid;
				
			}
				
		}
		    
	         int start=search(l-1,S,n)  ;
	        
	         return start!=-1?S.substring(start, start+l-1):"";
               
		}
	public static int search(int mid, String s, int n) {
		HashSet<Long> hset=new HashSet();
		long mod=(long) Math.pow(2, 32);
		long value=0;
		for(int i=0;i<mid;i++)
		{
			value=value*26+((int)s.charAt(i)-(int)'a');
			value=value%mod;
		}
		hset.add(value);
		long al=1;
		for(int i=0;i<mid;i++)
		{
			al=(al*26)%mod;
			
		}
		for(int i=1;i<=n-mid;++i)
		{
			value=(value*26-((int)s.charAt(i-1)-(int)'a')*al%mod+mod)%mod;
			value=(value+((int)s.charAt(i+mid-1)-(int)'a'))%mod;
			if(hset.contains(value))
			{
				
				return i;
			}
				
			else
				hset.add(value);
			
		}
		return -1;

	}
	           
		
   
	
}
