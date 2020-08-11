package com.leetcode.mayChallenges;

public class Trie {
	 
     
	    // trie node 
	    static class TrieNode 
	    { 
	        TrieNode[] children = new TrieNode[26]; 
	       
	        // isEndOfWord is true if the node represents 
	        // end of a word 
	        boolean isEndOfWord; 
	          
	        TrieNode(){ 
	            isEndOfWord = false; 
	            for (int i = 0; i < 26; i++) 
	                children[i] = null; 
	        } 
	    }; 
	       
	    static TrieNode root; 
	
	public Trie() {
	root=new TrieNode(); 
        
    }
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("jam");
		System.out.println(trie.search("jan"));   
		
		
	}
    
    /** Inserts a word into the trie. 
     * @return */
    public void insert(String word) {
    	int index;
    	
    	TrieNode p=root;
    	for(int i=0;i<word.length();i++)
    	{
    		index=word.charAt(0)-'a';
    		if(p.children[index]==null)
    			p.children[index]=new TrieNode();
    		p=p.children[index];
    	}
    	
    	p.isEndOfWord=true;
    	
        
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
    	int index;
    	
    	TrieNode p=root;
    	for(int i=0;i<word.length();i++)
    	{
    		index=word.charAt(i)-'a';
    		System.out.println(index);
    		if(p.children[index]==null)
    			return false;
    		p=p.children[index];
    	}
    	
    	return (p!= null && p.isEndOfWord);
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
    	int index;
    	
    	TrieNode p=root;
    	for(int i=0;i<prefix.length();i++)
    	{
    		index=prefix.charAt(0)-'a';
    		if(p.children[index]==null)
    			return false;
    		p=p.children[index];
    	}
    	
    	 return (p!= null);
        
    }

}
