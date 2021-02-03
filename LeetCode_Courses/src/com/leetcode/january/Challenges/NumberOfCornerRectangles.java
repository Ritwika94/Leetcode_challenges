package com.leetcode.january.Challenges;

public class NumberOfCornerRectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int countCornerRectangles(int[][] grid) {
		 int ans=0;
		 int count=0;
		 for(int i=0;i<grid.length;i++) {
			 for(int j=i+1;j<grid.length;j++) {
				 for(int k=0;k<grid[0].length;k++) {
					 if(grid[i][k]==1 && grid[j][k]==1) {
						count++;
					 }
				 }
				 if(count>0) {
					 ans+=count*(count-1)/2;
				 }
			 }
		 }
		return ans; 
	 }

}
