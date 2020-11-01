package com.leetcode.septemberChallenges;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {
		int k=3;
		int n=9;
		combinationSum3(k,n);
		for(List<Integer> list:alist) {
			System.out.print("[");
			for(int val :list) {
				System.out.print(val+" ");
			}
			System.out.print("]");
			System.out.println();
		}
	}
	  static List<List<Integer>> alist=new  ArrayList();
	    public static List<List<Integer>> combinationSum3(int k, int n) {
	        int arr[]=new int[9];
	        int j=1;
	        for(int i=0;i<arr.length;i++){
	            arr[i]=j;
	            j++;
	        }
	        
	        printCombination(arr,arr.length,k,n);
	        return alist;
	        
	    }
	     public static void printCombination(int arr[], int n, int r,int sum) 
	    { 
	   
	        int data[]=new int[r]; 
	  
	        combinationUtil(arr, n, r, 0, data, 0,sum); 
	    } 
	    
	     public static void combinationUtil(int arr[], int n, int r, int index,  int data[], int i,int sum) {
	         if(index==r){
	             int total=0;
	             for(int val:data)
	                 total+=val;
	             if(total==sum){
	                 List<Integer>  al=new ArrayList();
	                 for(int val:data)
	                    al.add(val);
	              alist.add(al);
	             }
	             return;
	         }
	         
	         if(i>=n)
	             return;
	         data[index]=arr[i];
	        combinationUtil(arr, n, r, index+1, data, i+1,sum); 
	        combinationUtil(arr, n, r, index, data, i+1,sum); 
	         
	     }
}
