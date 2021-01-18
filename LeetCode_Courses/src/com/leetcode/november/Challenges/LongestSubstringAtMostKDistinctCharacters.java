package com.leetcode.november.Challenges;

import java.util.HashMap;

public class LongestSubstringAtMostKDistinctCharacters {

	public static void main(String[] args) {
		String str="eceba";
		int k=2;
		System.out.println(longestSubstringAtMostKDistinctCharacters(str,k));

	}
	 public static int longestSubstringAtMostKDistinctCharacters(String str,int k) {
		 int l=0;
		 int i=0;
		 int maxlen=Integer.MIN_VALUE;
		 HashMap<Character,Integer> hmap=new HashMap();
		 
		 for(i=0;i<str.length();i++) {
			 hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0)+1);
			 while(hmap.size()>k) {
				 if(l<=i && hmap.get(str.charAt(l))>0)
					 hmap.put(str.charAt(l),hmap.get(str.charAt(l))-1);
				 if(hmap.get(str.charAt(l))==0)
					 hmap.remove(str.charAt(l));
				 l++;
			 }
			 maxlen=Math.max(maxlen, i-l+1);
		 }
		
		return maxlen;
		 
	 }

}
