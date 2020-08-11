package com.leetcode.mayChallenges;

public class JewelsAndStones {

	public static void main(String[] args) {
		
		System.out.println(numJewelsInStones("z",  "ZZ"));
	}
	
	 public static int numJewelsInStones(String J, String S) {
		 int count=0;
	        for(int i=0;i<S.length();i++)
	        	if(J.indexOf(S.charAt(i))!=-1){
	        		System.out.println(i);
	        		count++;
	        	}
	        		
	        {
	    
	        }
			return count;
	        
	    }

}
