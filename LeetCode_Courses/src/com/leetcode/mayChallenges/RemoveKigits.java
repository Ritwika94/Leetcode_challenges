package com.leetcode.mayChallenges;

public class RemoveKigits {

	public static void main(String[] args) {
		String num="112";
		
		System.out.println(removeKdigits(num,1));

	}
	
	 public static String removeKdigits(String num, int k) {
		 if(num.length()==k)
			 return "0";
		 String res="";
		 String s= buildString (num, res, k);
		 
		 String p="";
		 int i=0;
		 for(i=0;i<s.length();i++)
		 {
			 if(s.charAt(i)!='0')
				 break;
		 }
		 if(i==s.length())
			 return "0";
		 p=s.substring(i);
		 return p;
		
	}

	 public static String buildString(String num, String res,int k) {
		 if (k==0)  
	        { 
	            return num; 
	        } 
	  
	        int len = num.length(); 
	        if(len<=k) return "";
	        int minIndex = 0; 
	        for (int i = 1; i <= k; i++) 
	            if (num.charAt(i) < num.charAt(minIndex)) 
	                minIndex = i; 
	        res=""+num.charAt(minIndex); 
	        
	        String new_num = num.substring(minIndex + 1); 
	        return res+=buildString(new_num, res,k - minIndex);
	        
		 
	 }
}
