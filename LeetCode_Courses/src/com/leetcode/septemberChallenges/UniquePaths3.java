package com.leetcode.septemberChallenges;

import java.util.Arrays;

public class UniquePaths3 {
	static int count=0;
	static int count_zero=0;
	public static void main(String[] args) {
		int[][] grid= {{1,0,0,0},
				        {0,0,0,0},
				        {0,0,0,2}};
		System.out.println(uniquePathsIII(grid));

	}
	 public static int uniquePathsIII(int[][] grid) {
		 if(grid == null || grid.length == 0 || grid[0].length == 0) 
	            return 0;
		int n=grid.length;
		int m=grid[0].length;
	    
	    int x_coord=0;
	    int y_coord=0;
	   
	    for(int i=0;i<n;i++)
	        {
	          for(int j=0;j<m;j++) {
	        	  
				if(grid[i][j] == 0) count_zero++;
	        	  if(grid[i][j]==1) {
	        		 
	        		  x_coord=i;
	        		  y_coord=j;
	        		
	        	  }
	          }
	        }
	    
	    findCount(grid,x_coord,y_coord,n,m,0);
	    
		return count;
	        
	    }
	private static void findCount(int[][] grid, int i, int j, int n, int m,int curr) {
		
		if(i<0 || i>=n || j<0 || j>=m || grid[i][j]<0) {
			return;
			
		}
		if(grid[i][j] == 1 && curr > 0) return;
		if(grid[i][j]==2) {
			if(curr==count_zero)
				count++;
			return;
		}
		if(grid[i][j]==0) {
			grid[i][j]=-2;
			curr++;
			
			
		}
		 
	    findCount(grid,i,j+1,n,m,curr);
	    findCount(grid,i,j-1,n,m,curr);
	    findCount(grid,i+1,j,n,m,curr);
        findCount(grid,i-1,j,n,m,curr);
        
        if(grid[i][j]==-2) {
		
			grid[i][j]=0;
			curr--;
			
		}
	       
		
	}
	

}
