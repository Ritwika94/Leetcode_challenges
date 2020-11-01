package com.leetcode.septemberChallenges;

import java.util.HashMap;

public class BullsAndCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String getHint(String secret, String guess) {
	        int bullCount=0;
	        int i=0;
	        int j=0;
	        HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	        for(int p=0;p<secret.length();p++)
	            hmap.put(secret.charAt(p),(hmap.getOrDefault(secret.charAt(p),0))+1);
	        for(i=0,j=0;i<secret.length() && j<guess.length();i++,j++){
	           int a=secret.charAt(i);
	           int b=guess.charAt(j);
	            if(a==b){
	                  hmap.put(guess.charAt(j),hmap.get(guess.charAt(j))-1);
	                  bullCount++;
	            }
	                
	            
	        }
	       
	        int cowCount=0;
	        i=0;
	         for(int k=0;k<guess.length();k++){
	            int x=secret.indexOf(guess.charAt(k));
	            if(x!=-1 && secret.charAt(i)==guess.charAt(k)){
	                i++;
	                continue;
	            }
	                    
	            else if(x!=-1){
	                if(secret.charAt(i)!=guess.charAt(k) && hmap.get(guess.charAt(k))>0){
	                    cowCount++;
	                }
	            hmap.put(guess.charAt(k),hmap.get(guess.charAt(k))-1);
	            }
	          i++;      
	                
	        }
	        
	        String str=bullCount+"A"+cowCount+"B";
	        return str;
	    }

}
