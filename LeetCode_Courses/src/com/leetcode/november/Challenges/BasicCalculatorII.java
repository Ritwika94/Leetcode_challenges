package com.leetcode.november.Challenges;

public class BasicCalculatorII {

	public static void main(String[] args) {
		String s="3+5 / 2";
		System.out.println(calculate(s));

	}
	 public static int calculate(String s) {
	        int i=0;
	        int sign=1;
	        int md=-1;
	         int prev=0;
	        int result=0;
	        while(i<s.length()){
	            if(Character.isDigit(s.charAt(i))){
	                int num=(s.charAt(i)-'0');
	                while(++i<s.length() && Character.isDigit(s.charAt(i))){
	                    num=num*10+(s.charAt(i)-'0');
	                }
	                i--;
	             if(md==0){
	                 prev=prev/num;
	                 md=-1;
	             }
	            else if(md==1){
	                 prev=prev*num;
	                 md=-1;
	             }
	        else
	            prev=num;
	            
	          }
	        else if(s.charAt(i)=='/')
	                md=0;
	        else if(s.charAt(i)=='*')
	                md=1; 
	        else if(s.charAt(i)=='+'){
	            result=result+sign*prev;
	            sign=1;
	        }
	      else if(s.charAt(i)=='-'){
	            result=result+sign*prev;
	            sign=-1;
	        }
	       i++;       
	     }
	   result=result+sign*prev;
	      
	    return result;
	        
	    }

}
