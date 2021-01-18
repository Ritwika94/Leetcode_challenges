package com.leetcode.december.Challenges;

import java.util.HashMap;

public class LongestSubstringAtMostTwoDistinctCharacters {

	public static void main(String[] args) {
		String str="eceba";
		
		System.out.println(longestSubstringAtMostKDistinctCharacters(str));

	}
	 public static int longestSubstringAtMostKDistinctCharacters(String str) {
		 int l=0;
		 int i=0;
		 int maxlen=Integer.MIN_VALUE;
		 HashMap<Character,Integer> hmap=new HashMap();
		 
		 for(i=0;i<str.length();i++) {
			 hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0)+1);
			 while(hmap.size()>2) {
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
