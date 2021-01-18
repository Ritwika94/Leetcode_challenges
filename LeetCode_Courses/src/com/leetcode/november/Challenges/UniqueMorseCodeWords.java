package com.leetcode.november.Challenges;

import java.util.HashSet;

public class UniqueMorseCodeWords {

	public static void main(String[] args) {
		String[] words= {"gin", "zen", "gig", "msg"};
		System.out.println(uniqueMorseRepresentations(words));

	}
	 public static int uniqueMorseRepresentations(String[] words) {
	        String morseArr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	        HashSet<String> hset=new HashSet();
	        for(String s:words){
	            String sb="";
	            for(int i=0;i<s.length();i++){
	                sb+=morseArr[s.charAt(i)-'a'];
	            }
	            hset.add(sb);
	        }
	        return hset.size();
	    }

}
