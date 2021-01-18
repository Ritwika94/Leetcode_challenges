package com.leetcode.december.Challenges;

public class DecodeWays {

	public static void main(String[] args) {
		String s="226";
		System.out.println(numDecodings(s));

	}
	 public static int numDecodings(String s) {
	        char arr[]=s.toCharArray();
	        int n=s.length();
	        int dp[]=new int[n+1];
	        dp[0]=1;
	        dp[1]=1;
	         if(arr[0]=='0')   
		          return 0; 
	        for(int i=2;i<=n;i++){
	            dp[i]=0;
	            if(arr[i-1]>'0')
	              dp[i]=dp[i-1];
	            
	            if(arr[i-2]=='1'||(arr[i-2]=='2'&& arr[i-1]<'7'))
	                dp[i]+=dp[i-2];
	            
	            
	        }
	        return dp[n];
	        
	    }

}
