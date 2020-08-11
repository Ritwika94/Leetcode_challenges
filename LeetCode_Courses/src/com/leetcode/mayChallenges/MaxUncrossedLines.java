package com.leetcode.mayChallenges;

public class MaxUncrossedLines {

	public static void main(String[] args) {
		int[] A= {2,5,1,2,5}; 
		int[] B= {10,5,2,1,5,2};
		
		System.out.println(maxUncrossedLines(A,B));

	}
	
	public static int maxUncrossedLines(int[] A, int[] B) {
		 int m=A.length;
			int n=B.length;
			Integer[][] dp=new Integer[m][n];
			return maxlines(dp,A,B,0,0);
			
	        
	    }

		public static int maxlines(Integer[][] dp, int[] A, int[] B, int m, int n) {
			if(m>=A.length ||n>=B.length)
				return 0;
			if(dp[m][n]!=null)
				return dp[m][n];
			
			int max=Integer.MIN_VALUE;
			
			if(A[m]==B[n])
				max=maxlines(dp,A,B,m+1,n+1)+1;
			
			max=Math.max(max, maxlines(dp,A,B,m,n+1));
			max=Math.max(max, maxlines(dp,A,B,m+1,n));
			
			dp[m][n]=(max==Integer.MIN_VALUE)?0:max;
			
			return dp[m][n];
		}

}
