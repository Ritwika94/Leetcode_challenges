package com.leetcode.january.Challenges;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public String longestPalindrome(String s) {
	        if(s.length()==0)
	            return null;
	        
	        int n=s.length();
	        int dp[][]=new int[n][n];
	        
	        for(int i=0;i<n;i++){
	            dp[i][i]=1;
	        }
	        String str="";
	        int end=0;
	        int maxLen=1;
	        
	        for(int l=2;l<=n;l++){
	            for(int i=0;i<n-l+1;i++){
	                int j=i+l-1;
	                if(s.charAt(i)==s.charAt(j) && l==2){
	                    dp[i][j]=2;
	                        if(l>maxLen){
		                        end=j;
		                        maxLen=l;
		                    }
	                }
	                else if(dp[i+1][j-1]>0 && s.charAt(i)==s.charAt(j)){
	                     dp[i][j]=2+dp[i+1][j-1];
	                    if(l>maxLen){
		                        end=j;
		                        maxLen=l;
		                    }
	                }
	            }
	        }
	       return s.substring(end-maxLen+1, end+1); 
	        
	    }

}
