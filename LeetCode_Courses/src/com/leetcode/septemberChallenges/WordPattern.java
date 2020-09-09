package com.leetcode.septemberChallenges;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat dog"));
		System.out.println(wordPattern("abaa","dog cat cat dog"));

	}public static boolean wordPattern(String pattern, String str) {
        if(pattern==null || str==null)
            return false;
         if(pattern.isEmpty() || pattern.isEmpty())
            return false;
        String arr[]=str.split(" ");
        if(arr.length!=pattern.length())
            return false;
        HashMap<Character,String> hmap=new HashMap();
        HashMap<String,Character> hmap1=new HashMap();
        for(int i=0; i<arr.length;i++)
        {
            if(hmap1.containsKey(arr[i])){
                if(hmap1.get(arr[i])!=pattern.charAt(i))
                    return false;
            }
            if(hmap.containsKey(pattern.charAt(i))){
                String s=hmap.get(pattern.charAt(i));
               
                if(!(s.equals(arr[i])))
                    return false;
            }
            else{
                hmap.put(pattern.charAt(i),arr[i]);
                hmap1.put(arr[i],pattern.charAt(i));
            }
                
            
        }
       return true; 
    }

}
