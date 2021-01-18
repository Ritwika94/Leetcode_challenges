package com.leetcode.november.Challenges;

import java.util.HashMap;

public class LongestSubstringWithAtLeastKRepeatingCharacters {

	public static void main(String[] args) {
	String s="ababbc";
	int k=2;
	System.out.println(longestSubstring(s,k));

	}
	  public static int longestSubstring(String s, int k) {
	        int n=s.length();
	        HashMap<Character,Integer> hmap=new HashMap();
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
	           }
	        int l=0;
	        while(l<n && hmap.get(s.charAt(l))>=k)
	            l++;
	        if(l>=n-1)
	            return l;
	        int l1=longestSubstring(s.substring(0,l),k);
	        
	        while(l<n && hmap.get(s.charAt(l))<k)
	            l++;
	        int l2=(l<n)?longestSubstring(s.substring(l),k):0;
	        
	        return Math.max(l1,l2);
	        
	        
	    }

}
