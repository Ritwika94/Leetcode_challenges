package com.leetcode.december.Challenges;

public class ShortestWordDistance {

	public static void main(String[] args) {
		String[] words= {"practice", "makes", "perfect", "coding", "makes"};
		String word1="coding";
		String word2="practice";
		System.out.println(shortestDistance(words,word1,word2));
		System.out.println(shortestDistance(words,"makes","coding"));

	}
	 public static int shortestDistance(String[] words, String word1, String word2) {
		 int d1=-1;
		 int d2=-1;
		 int min=Integer.MAX_VALUE;
		 
		 for(int i=0;i<words.length;i++) {
			 if(words[i].equals(word1))
				 d1=i;
			 if(words[i].equals(word2))
				 d2=i;
			 if(d1!=-1 && d2!=-1)
				 min=Math.min(min, Math.abs(d1-d2));
		 }
		 return min;
	 }

}
