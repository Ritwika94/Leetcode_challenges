package com.leetcode.julyChallenges;

import java.util.StringTokenizer;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		System.out.println(reverseWords("  hello world!  "));

	}
	 public static String reverseWords(String s) {
	        StringTokenizer st = new StringTokenizer(s, " ");
	        StringBuffer sb1 = new StringBuffer();
	 
	        while(st.hasMoreElements())
	        {
	         sb1.append(st.nextElement()).append(" ");
	        }
	        String s1= sb1.toString();
	        s1=s1.trim();
	        String arr[]=s1.split(" ");
	        int len=arr.length-1;
	        StringBuilder sb=new StringBuilder();
	        for(int i=0;i<arr.length/2 ;i++)
	        {
	           String temp=arr[i];
	           arr[i]= arr[len];
	           arr[len]=temp;
	            len--;
	        }
	        
	          for(int i=0;i<arr.length ;i++)
	          {
	              sb.append(arr[i]);
	              if(i!=arr.length-1)
	                sb.append(" ");
	        }
	        return sb.toString();
	        
	        
	    }

}
