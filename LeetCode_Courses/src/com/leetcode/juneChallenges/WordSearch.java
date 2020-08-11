package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
	
	 static List<String> wordList=new ArrayList();
	 static class TrieNode
	{
	  TrieNode child[]=new TrieNode[26];
	  boolean leaf;
	  public TrieNode(){
		  leaf=false;
		  for(int i=0;i<26;i++)
			  child[i]=null;
	  }
	  
	}
	
	public static   List<String> findWords(char[][] board, String[] words) {
		if(words.length==0)
		{
			
			return wordList;
		}
			
		TrieNode root=new TrieNode();
		for(int i=0;i<words.length;i++)
		{
			
			insertInTrie(root,words[i]);
		}
		    
		
		findWordsfromBoard(board,root);
        return wordList;
        
    }
	public static  void findWordsfromBoard(char[][] board, TrieNode root) {
		TrieNode pChild=root;
		boolean visited[][]=new boolean[board.length][board[0].length];
	  for(int i=0;i<board.length;i++)
	  {
		  for(int j=0;j<board[0].length;j++)
		  {
			  	String str="";
				 int c=board[i][j]-'a';
				 if(root.child[c]!=null)
				 {
					 str = str + board[i][j]; 
	                    searchWord(pChild.child[c], 
	                               board, i, j, visited, str,board.length,board[0].length); 
	                    str = ""; 
				 }
			 
		  }
	  }
		
	}
	public static  void searchWord(TrieNode trieNode, char[][] board, int i, int j, boolean[][] visited, String str, int m, int n) {
		if(trieNode.leaf==true)
        {
            if(!wordList.contains(str))
				wordList.add(str);
        }
			
		if(isSafe(i,j,m,n,visited))
		{
			visited[i][j]=true;
		
		
		for(int k=0;k<26;k++)
		{
			if(trieNode.child[k]!=null)
			{
				char ch=(char)(k+'a');
				if(isSafe(i,j+1,m,n,visited) && ch==board[i][j+1])
					searchWord(trieNode.child[k],board,i,j+1,visited,str+ch,m,n);
				if(isSafe(i,j-1,m,n,visited) && ch==board[i][j-1])
					searchWord(trieNode.child[k],board,i,j-1,visited,str+ch,m,n);
				if(isSafe(i+1,j,m,n,visited) && ch==board[i+1][j])
					searchWord(trieNode.child[k],board,i+1,j,visited,str+ch,m,n);
				if(isSafe(i-1,j,m,n,visited) && ch==board[i-1][j])
					searchWord(trieNode.child[k],board,i-1,j,visited,str+ch,m,n);
					
			}
		}
		visited[i][j]=false;
		}
	}
	public static  boolean isSafe(int i, int j, int m, int n, boolean[][] visited) {
		 return (i >= 0 && i < m && j >= 0
	                && j < n && !visited[i][j]); 
	}
	public static  void insertInTrie(TrieNode root, String word) {
		int len=word.length();
		TrieNode pChild=root;
		
		for(int i=0;i<len;i++)
		{
			int c=word.charAt(i)-'a';
			if(pChild.child[c]==null)
				pChild.child[c]=new TrieNode();
							
			pChild=pChild.child[c];

				
		}
		pChild.leaf=true;
		
	}
	public static void main(String[] args) {
		char board[][] = {
				
				{'a'}
		};
		String words[] = {};
		findWords(board,words);
		for(int i=0;i<wordList.size();i++)
			System.out.println(wordList.get(i));


	}
}
