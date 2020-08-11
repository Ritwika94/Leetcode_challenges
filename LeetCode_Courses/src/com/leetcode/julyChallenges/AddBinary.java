package com.leetcode.julyChallenges;

public class AddBinary {

	public static void main(String[] args) {
		String a="1010";
		String b="1011";
		System.out.println(addBinary(a,b));

	}
	 public static String addBinary(String a, String b) {
	        int i=a.length()-1;
	        int j=b.length()-1;
	        int s=0;
	        String res="";
	        
	        while(i>=0 || j>=0 || s==1)
	        {
	            s+=i>=0?a.charAt(i)-'0':0;
	            s+=j>=0?b.charAt(j)-'0':0;
	            res=(char)(s%2 +'0')+res;
	            s=s/2;
	            i--;
	            j--;
	            
	        }
	        return res;
	        
	    }

}
