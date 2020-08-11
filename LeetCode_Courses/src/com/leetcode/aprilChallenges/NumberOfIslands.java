package com.leetcode.aprilChallenges;

public class NumberOfIslands {

	public static void main(String[] args) {
		 char[][] grid= {{'1','1','0','0','0'},
				 {'1','1','0','0','0'},
				 {'0','0','1','0','0'},
				 {'0','0','0','1','1'}};
		System.out.println(numIslands(grid));

	}
	
	public static int numIslands(char[][] grid) {
        int n=grid.length;
        if(n==0)
            return 0;
		 int m=grid[0].length;
		
		 boolean  visited[][]=new boolean[n][m];
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 visited[i][j]=false;
				 
			 }
		 }
		 int count=0;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				 if(!visited[i][j] && grid[i][j]=='1')
				 {
					 
					 findisland(grid,visited,i,j,n,m);
					 count++;
				 }
				
			 }
		 }
		return count;
	       
 }

	public static boolean findisland(char[][] grid, boolean[][] visited, int i, int j, int n, int m) {
		
		
		if(isSafe(i,j,n,m,grid,visited)) 
		{
			
			visited[i][j]=true;
			
			 findisland(grid,visited,i,j+1,n,m);
			 findisland(grid,visited,i,j-1,n,m);
			 findisland(grid,visited,i+1,j,n,m);
             findisland(grid,visited,i+1,j,n,m);
			  findisland(grid,visited,i-1,j,n,m);     
			 
		}
		return false;
		
}

	public static boolean isSafe(int i, int j, int n, int m, char[][] grid, boolean[][] visited) {
		return (i>=0 && i<n &&j>=0 && j<m && (grid[i][j]=='1') && (visited[i][j]==false));
		
	}

	

}
