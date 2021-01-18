package com.leetcode.december.Challenges;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] arr= {0,2,3,4,5,2,1,0};
		System.out.println(validMountainArray(arr));

	}
	 public static boolean validMountainArray(int[] arr) {
	      
	        int n=arr.length;
	        if(n<3)
	            return false;
	        int i=0;
	        int j=-1;
	        while(i<n-1){
	            if(arr[i]<arr[i+1])
	                i++;
	            else
	                break;
	        }
	        if(i==0 ||i==n-1)
	            return false;
	        
	        j=i;
	        while(j<n-1){
	            if(arr[j]>arr[j+1])
	                j++;
	              else
	                break;
	        }
	        
	        if(j==n-1)
	            return true;
	        return false;
	        
	        
	    }

}
