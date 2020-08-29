package com.leetcode.august.Challenges;

public class StreamChecker {
   public    StringBuilder queryString;
	class TrieNode
	{
		TrieNode children[]=new TrieNode[26] ;
		boolean isEnd;
		TrieNode()
		{
			for(int i=0;i<26;i++)
				children[i]=null;
			isEnd=false;
		}
	}
	TrieNode root=new TrieNode();
	 public StreamChecker(String[] words) {
		 queryString = new StringBuilder();
		 for(String word:words)
		 {
			 insertIntoTrie(word);
		 }
	        
	    }
	    
	    private void insertIntoTrie(String word) {
	    	TrieNode pNode=root;
	    	int index=0;
	    	for(int i=word.length()-1;i>=0;i--)
	    	{
	    		index=word.charAt(i)-'a';
	    		if(pNode.children[index]==null)
	    			pNode.children[index]=new TrieNode();
	    		pNode=pNode.children[index];
	    	}
	    	pNode.isEnd=true;
		
	}

		public boolean query(char letter) {
			queryString.append(letter);

			TrieNode pNode=root;
	    	int index=0;
	    	for(int i=queryString.length()-1;i>=0;i--)
	    	{
	    		index=queryString.charAt(i)-'a';
	    		if(pNode.children[index]==null)
	    			return false;
	    		pNode=pNode.children[index];
	    		if(pNode.isEnd)
	    			return true;
	    	}
	    	
	    	return false;
		
		
			
	        
	    }

		private boolean wordSearch(String word) {
			TrieNode pNode=root;
	    	int index=0;
	    	for(int i=0;i<word.length();i++)
	    	{
	    		index=word.charAt(i)-'a';
	    		if(pNode.children[index]==null)
	    			return false;
	    		pNode=pNode.children[index];
	    	}
	    	
	    	return (pNode !=null && pNode.isEnd==true);
		
		}
		public static void main(String[] args) {
			
		}

}
