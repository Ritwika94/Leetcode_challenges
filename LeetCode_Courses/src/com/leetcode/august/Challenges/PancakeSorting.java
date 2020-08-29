package com.leetcode.august.Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PancakeSorting {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<Integer> alist=pancakeSort(arr);
		for(int var:alist)
			System.out.print(var+" ");

	}
	 public static List<Integer> pancakeSort(int[] A) {
		 int n=A.length;
		 ArrayList<Integer> intList=new ArrayList();
		 for(int i=n;i>1;--i)
		 {
			 int max=findmax(A,i);
			 if(max!=i-1)
			 {
				 intList.add(max+1);
				 flip(A,max);
				 intList.add(i);
				 flip(A,i-1);
			 }
				 
			 
		 }
	
	
		return intList;
	        
	    }
	public static void flip(int[] a, int n) {
		int start=0;
		int end=n;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
		
		
	}
	public static int findmax(int[] a, int n) {
		int index=0;
		for(int i=0;i<n;i++)
		{
			if(a[index]<a[i])
				index=i;
		}
		
		return index;
	}

}
