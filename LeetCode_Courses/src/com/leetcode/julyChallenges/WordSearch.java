package com.leetcode.julyChallenges;

import java.util.Arrays;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public boolean exist(char[][] board, String word) {
	        int m=board[0].length;
	        int n=board.length;
	        int visited[][]=new int[n][m];
	        Arrays.fill(visited,0,0,0);
	        for(int i=0;i<n;i++)
	        {
	            for(int j=0;j<m;j++)
	            {
	                boolean val=isWordPresent(board,i,j,n,m,word,0,visited);
	                if(val)
	                {
	                    return true;
	                 }
	                 Arrays.stream(visited).forEach(a -> Arrays.fill(a, 0));   
	                 
	             }
	        }
	        return false;
	    }
	    
	    public boolean isWordPresent(char[][] board, int i, int j,int n,int m,String word,int index,int visited[][])    {
	    
	      if(index==word.length())
	          return true;
	        if(isSafe(i,j,n,m,visited) && word.charAt(index)==board[i][j])
	        {
	             visited[i][j]=1;
	            if(isWordPresent(board,i,j+1,n,m,word,index+1,visited))
	                return true;
	            if(isWordPresent(board,i,j-1,n,m,word,index+1,visited))
	                return true;
	            if(isWordPresent(board,i+1,j,n,m,word,index+1,visited))
	                return true;
	            if(isWordPresent(board,i-1,j,n,m,word,index+1,visited))
	                return true;
	             visited[i][j]=0;
	         }
	       
	        
	        return false;
	    }
	    public boolean isSafe(int i,int j,int n,int m,int visited[][])
	    {
	        return(i>=0 && i<n && j>=0 && j<m && visited[i][j]!=1);
	    }
	    

}
