package com.leetcode.january.Challenges;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean isValid(String s) {
	        if(s.length()==0 || s.length()==1)
	            return false;
	        Stack<Character> stack=new Stack();
	        int n=s.length();
	        
	        for(int i=0;i<n;i++){
	            if(s.charAt(i)=='(' || s.charAt(i)=='['|| s.charAt(i)=='{')
	                stack.push(s.charAt(i));
	            else if(s.charAt(i)==')')
	            {
	                if(!stack.isEmpty() && stack.peek()=='('){
	                    stack.pop();
	                }
	                else
	                    return false;
	            }
	            else if( s.charAt(i)=='}')
	            {
	                if(!stack.isEmpty() &&stack.peek()=='{'){
	                    stack.pop();
	                }
	                else
	                    return false;
	            }
	            else if( s.charAt(i)==']')
	            {
	                if(!stack.isEmpty()&& stack.peek()=='['){
	                    stack.pop();
	                }
	                else
	                    return false;
	            }
	        }
	     if(stack.isEmpty())              
	         return true;
	        else
	            return false;
	    }

}
