package com.leetcode.mayChallenges;

public class NoOfSquareSubmatricesWithOnes {
	

	public static void main(String[] args) {
		int mat[][]= {
				{1,0,1},
				{1,1,0},
				{1,1,0}
		};
		System.out.println(countSquares(mat));

	}
	public static int countSquares(int[][] matrix) {
		int m=matrix.length;
		int n=matrix[0].length;
		int countmatrix[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0)
					countmatrix[i][j]=0;
				else if(matrix[i-1][j-1]==0)
					countmatrix[i][j]=0;
				else if(matrix[i-1][j-1]==1)
					countmatrix[i][j]=findmin(countmatrix[i-1][j-1],countmatrix[i][j-1],countmatrix[i-1][j])+1;
				
			}
		}
		int count=0;
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				count+=countmatrix[i][j];
			}
		}
			
		return count;
        
    }
	public static int findmin(int i, int j, int k) {
		if(i<j)
		{
			if(i<k)
				return i;
			else
				return k;
		}
		else
		{
			if(j<k)
				return j;
			else
				return k;
		}
		
	}

}
