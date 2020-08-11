package com.leetcode.mayChallenges;

public class PermutationString {

	public static void main(String[] args) {
		System.out.println(checkInclusion( "ab" , "eidboaoo"));

	}
public static boolean checkInclusion(String s1, String s2) {
	if(s2.isEmpty())
	{
		return false;
	}
	
	int n1=s2.length();
	int n2=s1.length();
	
	if(n2>n1)
		return false;
	
	int count1[]=new int[256];
	int count2[]=new int[256];
	for(int i=0;i<s1.length();i++)
	{
		(count1[s2.charAt(i)])++;
		(count2[s1.charAt(i)])++;
	}
	for(int i=n2;i<n1;i++)
	{
		if(compare(count1,count2))
			return true;
		(count1[s2.charAt(i)])++;
		(count1[s2.charAt(i-n2)])--;
		
	}
	if (compare(count1, count2)) 
		return true;
	return false;
			

   

}
public static boolean compare(int[] count1, int[] count2) {
	for(int i=0;i<256;i++)
	{
		if(count1[i]!=count2[i])
			return false;
	}
	return true;
	
}

}
