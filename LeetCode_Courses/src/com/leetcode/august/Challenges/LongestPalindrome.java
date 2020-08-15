package com.leetcode.august.Challenges;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));

	}
	public static int longestPalindrome(String s) {
        HashMap<Character,Integer>  hmap=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i), 0)+1);
        }
        int res=0;
        boolean odd=false;
        
         for (Map.Entry<Character,Integer> entry : hmap.entrySet()) 
         {
             int x=entry.getValue();
             if(x%2==0)
                 res+=entry.getValue();
             else if(x%2==1)
             {
                  res+=entry.getValue()-1;
                  odd=true;
             }
         }
        if(odd )
            return res+1;
        
        return res;
        
    }

}
