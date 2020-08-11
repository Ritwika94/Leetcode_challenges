package com.leetcode.juneChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationSequence {
	
	public static void main(String[] args) {
		int n=8;

		int k=13801;
		System.out.println(getPermutation(n,k));

	}
	
	 public static String getPermutation(int n, int k) {
		 int fact[]=new int[n+1];
		 fact[0]=1;
		 fact[1]=1;
		 for(int i=2;i<fact.length;i++)
			 fact[i]=i*fact[i-1];
		 ArrayList<Integer> al=new ArrayList();
		 for(int i=1;i<=n;i++)
			 al.add(i);
		 StringBuilder str=new StringBuilder();
		 while(n>0)
		 {
			 int index=k/fact[n-1];
			 if(k%fact[n-1]==0)
				 index--;
			 str.append(al.get(index));
			 al.remove(index);
			 k= k%fact[n-1]==  0?fact[n-1]:k%fact[n-1];
			 n--;
		 }
		return str.toString();
		 
		 
		 
	        
	    }
	

}
