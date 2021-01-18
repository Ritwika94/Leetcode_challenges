package com.leetcode.december.Challenges;

import java.util.Arrays;

public class CherryPickupII {

	public static void main(String[] args) {
		int[][] grid = {{1,0,0,0,0,0,1},{2,0,0,0,0,3,0},{2,0,9,0,0,0,0},{0,3,0,5,4,0,0},{1,0,2,3,0,0,6}};
		System.out.println(cherryPickup(grid));

	}
	   static int dp[][][]=new int[71][71][71];
	     static int c[]={-1,0,1};
	    public static int cherryPickup(int[][] grid) {
	     for (int[][] row1 : dp){
	        for (int[] row : row1){
	              Arrays.fill(row, -1); 
	        }
	     }
	          
	         return pickCherry(grid,0,0,grid[0].length-1);
	        
	    }
	    
	    public static int pickCherry(int[][] grid, int r1,int r2,int r3){
	        if(r1==grid.length)
	            return 0;
	        if(dp[r1][r2][r3]!=-1)
	            return dp[r1][r2][r3];
	        int max=0;
	       
	        for(int i=0;i<3;i++){
	           for(int j=0;j<3;j++) {
	               int r2_new=r2+c[i];
	               int r3_new=r3+c[j];
	               
	               if(isValid(grid,r2_new,r3_new)){
	                   int x=grid[r1][r2];
	                   if(r2!=r3){
	                       x+=grid[r1][r3];
	                   }
	                   max=Math.max(max,x+pickCherry(grid,r1+1,r2_new,r3_new));
	               }
	           }
	        }
	        
	        return dp[r1][r2][r3]=max;
	    }
	    
	      public static boolean isValid(int[][] grid, int r1,int r2){
	          return (r1>=0 && r1<grid[0].length && r2>=0 && r2<grid[0].length);
	      }
	

}
