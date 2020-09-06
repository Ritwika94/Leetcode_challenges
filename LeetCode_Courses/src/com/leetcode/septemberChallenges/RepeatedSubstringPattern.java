package com.leetcode.septemberChallenges;

public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abcdabcdabcdabcd"));
		System.out.println(repeatedSubstringPattern("abcdpqrsabcd"));
	}
	public static boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int lps[]=new int[n];
        computeLongestPrefix(s,lps,n);
        
        int len=lps[n-1];
       
        if(len>0 && n%(n-len) == 0)
            return true;
        else
            return false;
    }
    
    public static void computeLongestPrefix(String s,int lps[],int n) {
        int i=1;
        int j=0;
        lps[0]=0;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
                i++;
            }
            else {
                if(j!=0){
                    j=lps[j-1];
                    
                }
                else{
                    lps[i] = 0; 
                    i++;
                }
                   
            }
           
        }
        
    }

}
