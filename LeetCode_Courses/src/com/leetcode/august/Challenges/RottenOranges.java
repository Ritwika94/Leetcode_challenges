package com.leetcode.august.Challenges;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	static class Element
	{
		int x;
		int y;
		Element(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}
    static int time=0;
	public static void main(String[] args) {
		int[][] grid ={{2,1,1},
						{1,1,0},
						{0,1,1}};
		System.out.println(orangesRotting(grid));

	}
	 public static int orangesRotting(int[][] grid) {
		 Queue<Element> q=new LinkedList<Element>();
		 int r=grid.length;
		 int c=grid[0].length;
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 if(grid[i][j]==2)
					 
					 q.add(new Element(i,j));
			 }
		 }
		 q.add(new Element(-1,-1));
		 while(!q.isEmpty())
		 {
			 boolean flag=false;
			 
			 while(!hasreached(q.peek()))
			 {
				 Element temp=q.peek();
				
				 if(isSafe(temp.x+1,temp.y,r,c) && grid[temp.x+1][temp.y]==1)
				 {
					 
					 if(!flag)
					 {
						 flag=true;
						 time++;
					 }
						
					 grid[temp.x+1][temp.y]=2;
					 temp.x++;
					 q.add(new Element(temp.x,temp.y) );
					 temp.x--;
					 
				 }
				 if(isSafe(temp.x-1,temp.y,r,c) && grid[temp.x-1][temp.y]==1)
				 {
					 if(!flag)
					 {
						 flag=true;
						 time++;
					 }
						
					 grid[temp.x-1][temp.y]=2;
					 temp.x--;
					 q.add(new Element(temp.x,temp.y) );
					 temp.x++;
					 
				 }
				 if(isSafe(temp.x,temp.y+1,r,c) && grid[temp.x][temp.y+1]==1)
				 {
					 if(!flag)
					 {
						 flag=true;
						 time++;
					 }
						
					 grid[temp.x][temp.y+1]=2;
					 temp.y++;
					 q.add(new Element(temp.x,temp.y) );
					 temp.y--;
					 
				 }
				 if(isSafe(temp.x,temp.y-1,r,c) && grid[temp.x][temp.y-1]==1)
				 {
					 if(!flag)
					 {
						 flag=true;
						 time++;
					 }
						
					 grid[temp.x][temp.y-1]=2;
					 temp.y--;
					 q.add(new Element(temp.x,temp.y) );
					 temp.y++;
					 
				 }
				 q.remove();
				 
			 }
			 q.remove();
			 if(!q.isEmpty())
				 q.add(new Element(-1,-1));
		 }
		 for(int i=0;i<r;i++)
		 {
			 for(int j=0;j<c;j++)
			 {
				 if(grid[i][j]==1)
				 {
					 
					 return -1;
				 }
					
			 }
		 }
		 return time ;
	    }
	private static boolean isSafe(int i, int j, int r, int c) {
		
		return (i>=0 && i<r && j>=0 && j<c);
	}
	private static boolean hasreached(Element el) {
		
		return (el.x==-1 && el.y==-1);
	}
	

}
