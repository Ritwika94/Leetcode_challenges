package com.leetcode.october.Challenges;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
		for(int x:nums)
			System.out.print(x+" ");
	}
	 public static void rotate(int[] nums, int k) {
	        if(nums.length==1)
	            return;
	          if(nums.length==k)
	            return;
	        if(nums.length<k)
	           k=k%nums.length;
	        int n=nums.length;
	        move(nums,n-k,n-1);
	        move(nums,0,n-k-1);
	        move(nums,0,n-1);
	        
	    }
	    static void move(int A[], int low, int high){
	        for(int i=low,j=high;i<j;i++,j--){
	            int t=A[i];
	            A[i]=A[j];
	            A[j]=t;
	        }
	    }

}
