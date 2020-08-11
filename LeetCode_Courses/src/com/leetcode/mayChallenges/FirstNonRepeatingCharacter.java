package com.leetcode.mayChallenges;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));

	}
	
   public static int firstUniqChar(String s) {
	   if(s.isEmpty())
		   return -1;
	   
	   HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	   for(int i=0;i<s.length();i++)
	   {
		   if(hmap.containsKey(s.charAt(i)))
		   {
			   hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
		   }
		   else
		   {
			   hmap.put(s.charAt(i),1);
		   }
	   }
	   
     int index=0;
     int flag=0;
     for(int i=0;i<s.length();i++)
	   {
    	 if(hmap.get(s.charAt(i))==1)
    	 {
    		 index=i;
    		 flag=1;
    		 break;
    	 }
	   }
     if(flag==0)
    	 return -1;
     
     return index;
        
    }

}
