package com.leetcode.october.Challenges;

import java.util.Stack;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		System.out.println(removeDuplicateLetters("bcabc"));
		System.out.println(removeDuplicateLetters("cbacdcbc"));

	}
	public static String removeDuplicateLetters(String s) {
	       int [] res = new int[26];
	        boolean [] visited = new boolean [26];
	        char[] chars = s.toCharArray();
	        Stack<Character> st = new Stack<>();
	        
	        for(char c:chars)
	            res[c-'a']++;
	        int index=-1;
	        for(char c:chars){
	             index=c-'a';
	            res[index]--;
	            if(visited[index])
	                continue;
	            
	            while(!st.isEmpty() && c<st.peek() && res[st.peek()-'a']!=0)
	            {
	                char top=st.pop();
	                visited[top-'a']=false;
	            }
	            st.push(c);
	            visited[index]=true;
	            
	        }
	        StringBuilder sb = new StringBuilder();
	        while (!st.isEmpty()){
	            sb.insert(0, st.pop());
	        }
	        return sb.toString();
	        
	    }

}
