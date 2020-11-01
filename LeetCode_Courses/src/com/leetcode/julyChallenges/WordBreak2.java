package com.leetcode.julyChallenges;

import java.util.ArrayList;
import java.util.List;

public class WordBreak2 {

	public static void main(String[] args) {
		String s="catsanddog";
		List<String> wordDict=new ArrayList();
		wordDict.add("cat");
		wordDict.add("cats");
		wordDict.add("and");
		wordDict.add("sand");
		wordDict.add("dog");
		wordBreak(s,wordDict);

	}
	 public static List<String> wordBreak(String s, List<String> wordDict) {
	        List<String> dp[]=new ArrayList[s.length()+1];
	        dp[0]=new ArrayList<String>();
	        
	        for(int i=0;i<s.length();i++)
	        {
	           if(dp[i]==null)
	               continue;
	            for(String w:wordDict)
	            {
	                int end=i+w.length();
	              
	                if(end>s.length()) {
	                
	                	  continue;
	                }
	                  
	                
	                if(s.substring(i,end).equals(w))
	                {
	                	 System.out.println("index:"+i+" end:"+end);
	                    if(dp[end]==null)
	                        dp[end]=new ArrayList<String>();
	                    
	                    dp[end].add(w);
	                }
	            }
	         }
	     List<String> res=new ArrayList();
	     if(dp[s.length()]==null)
	        return res;
	    List<String> temp=new ArrayList();
	    for(int i=0;i<dp.length;i++) {
	    	List<String> list=dp[i];
	    	if(list!=null && !list.isEmpty()) {
	    		System.out.print(i+":");
	    		for(String st: list)
	    			System.out.print(st+" ");
	    	}
	    	System.out.println();
	    }
	    dfs(dp,res,s.length(),temp);
	    return res;
	        
	    }
	     public static void dfs( List<String> dp[], List<String> res,int end, List<String> temp) 
	     {
	         if(end<=0)
	         {
	             String path=temp.get(temp.size()-1);
	             for(int i=temp.size()-2;i>=0;i--)
	                 path+=" "+temp.get(i);
	             res.add(path);
	             return;
	         }
	         for(String word:dp[end])
	         {
	             temp.add(word);
	              dfs(dp,res,end-word.length(),temp);
	              temp.remove(temp.size()-1);
	          }
	         
	 }

}
