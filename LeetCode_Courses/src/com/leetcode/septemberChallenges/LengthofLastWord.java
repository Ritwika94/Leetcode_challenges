package com.leetcode.septemberChallenges;

public class LengthofLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}
	  public static int lengthOfLastWord(String s) {
	        String arr[]=s.split(" ");
	        int n=arr.length;
	        
	        if(n==0)
	            return 0;
	        return arr[n-1].length();
	    }
}
