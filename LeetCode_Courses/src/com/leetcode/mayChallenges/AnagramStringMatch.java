package com.leetcode.mayChallenges;

import java.util.ArrayList;
import java.util.List;

public class AnagramStringMatch {
	
	public static void main(String[] args) {
		List<Integer> list1=findAnagrams("abab" , "ab");
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+" ");
		}

	}
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list=new  ArrayList<Integer>();
		if(s.isEmpty())
		{
			return list;
		}
		
		int n1=s.length();
		int n2=p.length();
		
		if(n2>n1)
			return list;
		
		int count1[]=new int[256];
		int count2[]=new int[256];
		for(int i=0;i<p.length();i++)
		{
			(count1[s.charAt(i)])++;
			(count2[p.charAt(i)])++;
		}
		for(int i=n2;i<n1;i++)
		{
			if(compare(count1,count2))
				list.add(i-n2);
			(count1[s.charAt(i)])++;
			(count1[s.charAt(i-n2)])--;
			
		}
		if (compare(count1, count2)) 
			list.add(n1-n2);
		return list;
				
	
       
	
    }
	public static boolean compare(int[] count1, int[] count2) {
		for(int i=0;i<256;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		}
		return true;
		
	}
    
   

}
