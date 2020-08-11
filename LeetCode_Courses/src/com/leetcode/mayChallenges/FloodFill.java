package com.leetcode.mayChallenges;

public class FloodFill {
  
	public static void main(String[] args) {
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr=1;
		int sc=1;
		int newColor=2;
		int[][] im= floodFill(image,  sr, sc,  newColor);
		for(int i=0;i<im.length;i++)
		{
			System.out.print("[");
			for(int j=0;j<im[0].length;j++)
			{
				System.out.print(im[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		

	}
public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
	int r=image.length;
	int c=image[0].length;
	int[][] visited=new int[r][c];
	int color=image[sr][sc];
	int row[]= {-1,0,0,+1};
	int col[]= {0,-1,+1,0};
	
	dfs(image, visited,sr,sc,color,newColor,row,col);
	
	return image;
        
    }
private static void dfs(int[][] image, int[][] visited, int sr, int sc, int color, int newColor, int[] row, int[] col) {
	visited[sr][sc]=1;
	image[sr][sc]=newColor;
	
	for(int i=0;i<4;i++)
	{
		if(isValid(sr+row[i],sc+col[i],visited,image,color))
		{
			dfs(image,visited,sr+row[i],sc+col[i],color,newColor,row,col);
		}
	}
	
	
}
private static boolean isValid(int i, int j, int[][] visited, int[][] image, int color) {
	if(i>=0 && i<image.length && j>=0 && j<image[0].length && visited[i][j]==0 && image[i][j]==color)
	  return true;
	
	return false;
}

}
