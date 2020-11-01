package com.leetcode.septemberChallenges;

import java.util.HashMap;

public class FindTheDifference {

	public static void main(String[] args) {
		String s= "abcd";
		String t="abcde";
		System.out.println(findTheDifference(s,t));

	}
	 public static char findTheDifference(String s, String t) {
	        if(s.isEmpty() || s==null)
	        {
	            if(t.length()==1)
	                return t.charAt(0);
	            else
	                return  '\0' ;
	        }
	      HashMap<Character,Integer> hmap=new HashMap();
	      HashMap<Character,Integer> hmap2=new HashMap();
	        
	        for(int i=0;i<s.length();i++){
	           hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);
	       }
	         for(int i=0;i<t.length();i++){
	           hmap2.put(t.charAt(i),hmap2.getOrDefault(t.charAt(i),0)+1);
	       }
	         for(int i=0;i<t.length();i++){
	           Integer count1=hmap2.get(t.charAt(i));
	           Integer count2=hmap.get(t.charAt(i));
	           if(count1!=count2 || count2==null)
	                return t.charAt(i);
	           
	       }
	    return  '\0' ;
	        
	        
	    }

}
