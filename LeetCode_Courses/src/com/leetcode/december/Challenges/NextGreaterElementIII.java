package com.leetcode.december.Challenges;

import java.util.Arrays;

public class NextGreaterElementIII {

	public static void main(String[] args) {
		System.out.println(nextGreaterElement(45678));

	}
	 public static int nextGreaterElement(int n) {
	       char[] arr = (n + "").toCharArray();
	        int i=0;
	        for(i=arr.length-1;i>0;i--){
	            if(arr[i-1]<arr[i])
	                break;
	        }
	        if(i==0)
	            return -1;
	        else{
	            int x=arr[i-1];
	           int  min=i;
	            for(int j=i+1;j<arr.length;j++){
	                if(arr[j]>x && arr[j]<arr[min]){
	                    min=j;
	                }
	            }
	            swap(arr,i-1,min);
	            Arrays.sort(arr,i,arr.length);
	        }
	        
	        long val = Long.parseLong(new String(arr));
	        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
	      
	      
	    }
	    
	     public static void swap(char arr[], int i,int j){
	         char temp=arr[i];
	         arr[i]=arr[j];
	         arr[j]=temp;
	         
	     }

}
