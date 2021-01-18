package com.leetcode.december.Challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PalindromePartitioning {
	  List<List<String>> alist=new LinkedList();
	    public List<List<String>> partition(String s) {
	        int n=s.length();
	        boolean P[][]=new boolean[n][n];
	        checkPalindrome(s,P);
	        List<String> curr=new ArrayList();
	        process(s,P,curr,0);
	        return alist;
	        
	    }
	     public  void process(String s, boolean P[][],  List<String> curr,int start){
	         if(start==s.length())
	             alist.add(new LinkedList(curr));
	         for(int i=start;i<s.length();i++){
	             if(P[start][i]==true){
	                 curr.add(s.substring(start,i+1));
	                 process(s,P,curr,i+1);
	                 curr.remove(curr.size()-1);
	             }
	         }
	         
	     }
	     public  void checkPalindrome(String s, boolean P[][]) {
	        int n=s.length(); 
	        for(int i=0;i<n;i++)
	            P[i][i]=true;
	       
	        for(int l=2;l<=n;l++){
	             for(int i=0;i<n-l+1;i++){
	                 int j=i+l-1;
	                 if(l==2 && s.charAt(i)== s.charAt(j)){
	                     P[i][j]=true;
	                   
	                 }
	                 else if(s.charAt(i)== s.charAt(j)){
	                     P[i][j]=P[i+1][j-1];
	                     
	                 }
	             }
	        }
	         
	     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
