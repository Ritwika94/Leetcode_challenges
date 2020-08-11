package com.leetcode.august.Challenges;

public class DetectCapital {

	public static void main(String[] args) {
		String word="FlaG";
		System.out.println(detectCapitalUse(word));

	}
	
	public static boolean detectCapitalUse(String word) {
		if(word==null)
			return false;
		int i=0;
		for( i=0;i<word.length();i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
				continue;
			else
				break;
		}
		if(i==word.length())
			return true;
		for( i=0;i<word.length();i++)
		{
			if(Character.isLowerCase(word.charAt(i)))
				continue;
			else
				break;
		}
		if(i==word.length())
			return true;
		for( i=0;i<word.length();i++)
		{
			if(i==0 && Character.isUpperCase(word.charAt(i)))
				continue;
			else if(Character.isUpperCase(word.charAt(i)))
				break;
		}
		if(i==word.length())
			return true;
		
		return false;
        
    }

}
