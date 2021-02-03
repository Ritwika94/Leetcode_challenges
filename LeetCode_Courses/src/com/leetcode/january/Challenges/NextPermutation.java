package com.leetcode.january.Challenges;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums= {1,1,5};
		nextPermutation(nums);

	}
	
	 public static void nextPermutation(int[] nums) {
	        int index=-1;
	        int index2=-1;
	        for(int i=nums.length-2;i>=0;i--){
	            if(nums[i]<nums[i+1]){
	                index=i;
	                break;
	            }
	        }
	        if(index==-1){
	            reverse(nums,0,nums.length-1);
	            return;
	        }
	         for(int i=nums.length-1;i> index;i--){
	             if(nums[i]>nums[index]){
	                 index2=i;
	                 break;
	             }
	         }
	        swap(nums,index,index2);
	        reverse(nums,index+1,nums.length-1);
	    }
	    public static void reverse(int nums[],int i,int j){
	        while(i<j){
	              swap(nums,i,j);
	              i++;
	              j--;
	        }
	    }
	      public static void swap(int nums[],int i,int j){
	       int temp=nums[i];
	       nums[i]=nums[j];
	        nums[j]=temp;
	    }

}
