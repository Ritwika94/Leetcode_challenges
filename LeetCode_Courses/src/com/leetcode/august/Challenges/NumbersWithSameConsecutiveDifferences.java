package com.leetcode.august.Challenges;

import java.util.ArrayList;

public class NumbersWithSameConsecutiveDifferences {

	public static void main(String[] args) {
		
		int N=3;
		int K=7;
		int arr[]=numsSameConsecDiff(N,K);
		System.out.print("[");
		 for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
		  }
		 System.out.print("]");
	}
	
	  public static int[] numsSameConsecDiff(int N, int K) {
		  ArrayList<Integer> result=new ArrayList();
		  int start=N==1?0:1;
		  for(int i=start;i<=9;i++)
		  {
			  dfs(result,N-1,K,i);
		  }
		return result.stream().mapToInt(i->i).toArray();
	        
	        
	    }

	private static void dfs(ArrayList<Integer> result, int N, int K, int curr) {
		if(N==0)
		{
			result.add(curr);
			return;
		}
		int digit=curr%10;
		for(int i=0;i<=9;i++)
		{
			if(Math.abs(digit-i)==K)
			{
				dfs(result,N-1,K,curr*10+i);
			}
				
		}
		
		
	}

}
