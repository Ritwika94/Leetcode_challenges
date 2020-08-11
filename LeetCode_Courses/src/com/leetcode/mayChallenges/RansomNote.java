package com.leetcode.mayChallenges;

public class RansomNote {

	public static void main(String[] args) {
     
		System.out.println(canConstruct("bjaajgea",
				"affhiiicabhbdchbidghccijjbfjfhjeddgggbajhidhjchiedhdibgeaecffbbbefiabjdhggihccec"));
		System.out.println(canConstruct("a", "b"));
		System.out.println(canConstruct("aa", "ab"));
		System.out.println(canConstruct("aa", "aab"));
	}
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 if(magazine.isEmpty() && !(ransomNote.isEmpty()))
	            return false;
	     if((magazine.isEmpty() && (ransomNote.isEmpty())))
	            return true;
	     if(ransomNote.isEmpty() && !(magazine.isEmpty()))
	            return true;
	     int c1[]=new int[256];
	     
	     
	     
		
		 for(int i=0;i< magazine.length(); i++)
		 {
			 c1[magazine.charAt(i)]++;
			 
		 }
		 for(int j=0;j<ransomNote.length(); j++)
		 {
			 char c=ransomNote.charAt(j);
			 if(c1[c]>0)
			 {
				 c1[c]--;
			 }
			 else 
				 return false;
			 
			 
		 }
		
		 return true;
		
		       
	    }

}
