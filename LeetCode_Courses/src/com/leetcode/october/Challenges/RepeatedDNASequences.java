package com.leetcode.october.Challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
	 static List<String> alist=new ArrayList();
	public static void main(String[] args) {
		findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		for(String st:alist) {
			System.out.println(st);
		}

	}
	 
	    public static List<String> findRepeatedDnaSequences(String s) {
	  
	      HashSet<String> hset=new HashSet();
	      int n=s.length();
	     
	        for(int i=0;i<s.length();i++){
	            if(i+10>n)
	                break;
	            String temp=s.substring(i,i+10);
	            
	            if(hset.contains(temp)){
	                  if(!alist.contains(temp))
	                    alist.add(temp);
	           }
	           else 
	             hset.add(temp);
	            
	         
	        }
	     return alist;
	        
	    }

}
