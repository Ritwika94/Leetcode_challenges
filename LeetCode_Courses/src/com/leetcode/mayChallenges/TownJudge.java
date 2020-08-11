package com.leetcode.mayChallenges;

public class TownJudge {

	public static void main(String[] args) {
		int N=4;
		int trust[][]= {{1,3},{1,4},{2,3},{2,4},{1,3},{4,3}};
		System.out.println(findJudge(N, trust));

	}

   public static int findJudge(int N, int[][] trust) {
	   int a=0;
	   int b=N-1;
	   int arr[][]=new int[N][N];
	   for(int i=0;i<trust.length;i++)
	   {
		 
		  
		  arr[trust[i][0]-1][trust[i][1]-1]=1;
	   }
	   while(a<b)
	   {
		   if(arr[a][b]==1)
			  {
				  a++;
			  }
			  else
				  b--;
		 }
		     
	   for(int i=0;i<N;i++)
	   {
		   if(i!=a && ((arr[a][i]==1) || arr[i][a]==0))
			   return -1;
	   }
	return a+1;
        
    }
}
