package com.leetcode.january.Challenges;

public class CheckIfTwoStringArraysAreEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
	        StringBuilder  str1=new StringBuilder();
	        StringBuilder  str2=new StringBuilder();
	        
	        for(String val:word1)
	            str1.append(val);
	        
	        for(String val:word2)
	            str2.append(val);
	        
	        System.out.println(str1);
	         System.out.println(str2);
	        
	        if(str1.toString().equals(str2.toString()))
	            return true;
	        
	        return false;
	    }

}
