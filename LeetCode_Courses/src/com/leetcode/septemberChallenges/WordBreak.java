package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
	String s="applepenapple";
	List<String> wordDict= new ArrayList();
	wordDict.add("apple");
	wordDict.add("pen");
	System.out.println(wordBreak(s,wordDict));

	}
	public static boolean wordBreak(String s, List<String> wordDict) {
        boolean dp[]=new boolean[s.length()+1];
        dp[0]=true;
        for(int i=0;i<s.length();i++){
            if(!dp[i])
                continue;
            
            for(String word:wordDict){
                
                int end=i+word.length();
                if(end >s.length())
                    continue;
                if(dp[end]==true)
                    continue;
                if(s.substring(i,end).equals(word)){
                    dp[end]=true;
                }
            }
        }
       return dp[s.length()];
    }

}
