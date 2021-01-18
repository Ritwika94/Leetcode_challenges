package com.leetcode.november.Challenges;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		String s="3[pq]mn3[a2[cb]]ef";
		System.out.println(decodeString(s));
	}
	 public static String decodeString(String s) {
		 Stack<Integer> integerstack = new Stack<>(); 
	        Stack<Character> stringstack = new Stack<>(); 
	        String temp = "", result = ""; 
	        for(int i=0;i<s.length();i++) {
	        	 int count = 0; 
	        	if(Character.isDigit(s.charAt(i))) {
	        		
	        		while(Character.isDigit(s.charAt(i))) {
	        			count=count*10+s.charAt(i)-'0';
	        			i++;
	        		}
	        		integerstack.push(count);
	        		i--;
	        		
	        	}
	        	else if(s.charAt(i)==']'){
	        		temp="";
	        		count=0;
	        		if(!integerstack.isEmpty()) {
	        			count=integerstack.pop();
	        		}
	        		while(!stringstack.isEmpty() && stringstack.peek()!='[') {
	        			temp=stringstack.peek()+temp;
	        			stringstack.pop();
	        		}
	        		if(!stringstack.isEmpty() && stringstack.peek()=='[')
	        			stringstack.pop();
	        		while(count>0) {
	        			result=result+temp;
	        			count--;
	        		}
	        		for (int j = 0; j < result.length(); j++) 
	                    stringstack.push(result.charAt(j)); 
	       
	                result = ""; 
	        		
	        	}
	        	else if(s.charAt(i)=='[') {
	        		if (Character.isDigit(s.charAt(i-1))) 
	                    stringstack.push(s.charAt(i)); 
	       
	                else
	                { 
	                    stringstack.push(s.charAt(i)); 
	                    integerstack.push(1); 
	                } 
	        	}
	        	else
	        		stringstack.push(s.charAt(i)); 
	        }
	        while (!stringstack.isEmpty()) 
	        { 
	            result = stringstack.peek() + result; 
	            stringstack.pop(); 
	        } 
	        return result;
	 }

}
