package com.leetcode.julyChallenges;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int islandPerimeter(int[][] grid) {
	        int n=grid.length;
	        int m=grid[0].length;
	        int finalcount=0;
	        if(n==1 && m==1)
	            return 4;
	        for(int i=0;i<n;i++)
	        {
	             for(int j=0;j<m;j++)
	             {
	                 int peri=0;
	                 if(grid[i][j]==1)
	                 {
	                     if((isSafe(i+1,j,n,m) && grid[i+1][j]==0))
	                     {
	                         peri++;
	                       }
	                      if((isSafe(i-1,j,n,m) && grid[i-1][j]==0))
	                     {
	                         peri++;
	                       }
	                        
	                     if((isSafe(i,j+1,n,m) && grid[i][j+1]==0))
	                     {
	                         peri++;
	                       }
	                      if((isSafe(i,j-1,n,m) && grid[i][j-1]==0))
	                     {
	                         peri++;
	                       }
	                    if((i==n-1 ||i==0) &&(j==0 || j==m-1))
	                    {
	                        peri+=2;
	                        if(n==1 || m==1)
	                            peri++;
	                        
	                    }
	                        
	                     
	                    if((i==n-1 ||i==0) &&(j!=0 && j!=m-1))
	                    {
	                           peri++;
	                            if(n==1 || m==1)
	                                peri++;
	                      }
	                      
	                     if((j==m-1 ||j==0) &&(i!=0 && i!=n-1))
	                     {
	                           peri++;
	                            if(n==1 || m==1)
	                                peri++;
	                      }
	                        
	                    
	                     System.out.println(peri);
	                    
	                  finalcount+=peri;
	                }
	             }
	        }
	    return finalcount;
	        
	    }
	public boolean isSafe(int i,int j,int n,int m) 
	{
	    return(i>=0 && i<n && j>=0 && j<m);
	}

}
