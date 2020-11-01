package com.leetcode.august.Challenges;

import java.util.HashMap;

public class KMostFrequentElements {

	 public static void main(String args[]) 
	    { 
	        int k = 4; 
	        int[] arr = { 5, 2, 1, 3, 2 }; 
	        int n = arr.length; 
	        kTop(arr, n, k); 
	    }

	private static void kTop(int[] arr, int n, int k) {
		HashMap<Integer,Integer> hmap=new HashMap();
		int arr1[]=new int[k+1];
		for(int i=0;i<k+1;i++) {
			hmap.put(i, 0);
		}
		for(int i=0;i<n;i++) {
			hmap.put(arr[i], hmap.getOrDefault(arr[i], 0)+1);
			arr1[k]=arr[i];
			int index=find(arr1,arr[i]);
			
			index--;
			while(index>=0) {
				if(hmap.get(arr1[index+1])>hmap.get(arr1[index])) {
					
					swap(arr1,index,index+1);
				}
				else if(hmap.get(arr1[index+1])==hmap.get(arr1[index])&& arr[index+1]<arr[index]) {
					
					swap(arr1,index,index+1);
				}
				else
					break;
				index--;
				
				
			}
			  for (int j = 0; j < k && arr1[j] != 0; ++j) {
				
				  System.out.print(arr1[j] + " ");
			  }
	               
			System.out.println();
		
		}
		
		
	}


	private static void swap(int[] arr1, int i, int j) {
	int temp=arr1[i];
	arr1[i]=arr1[j];
	arr1[j]=temp;
		
	}

	private static int find(int[] arr1, int k) {
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==k)
				return i;
		}
		
		return -1;
	} 

}
