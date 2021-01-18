package com.leetcode.december.Challenges;

public class DecodedStringAtIndex {

	public static void main(String[] args) {
		decodeAtIndex("leet2code3",10);
		decodeAtIndex("haa5",5);
		decodeAtIndex("a2345678999999999999999",1);

	}
	
	 public static String decodeAtIndex(String S, int K) {
	        long size=0;
	       
	        for(int i=0;i<S.length();i++){
	            if(Character.isDigit(S.charAt(i)))
	                size=size*(S.charAt(i)-'0');
	            else
	                size=size+1;
	            
	        }
	        
	        for(int i=S.length()-1;i>=0;i--){
	            K %= size; 
	            if(K==0 && Character.isAlphabetic(S.charAt(i)))
	                return ""+S.charAt(i);
	            
	             if(Character.isDigit(S.charAt(i))){
	                 size=size/(S.charAt(i)-'0');
	             }
	            else
	                size--;
	        }
	        return "";
	    }

}
