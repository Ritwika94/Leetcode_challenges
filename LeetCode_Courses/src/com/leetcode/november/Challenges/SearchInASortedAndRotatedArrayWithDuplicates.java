package com.leetcode.november.Challenges;

public class SearchInASortedAndRotatedArrayWithDuplicates {

	public static void main(String[] args) {
	int[] nums= {2,5,6,0,0,1,2};
	int t=0;
	System.out.println(search(nums,t));

	}
	 public static boolean search(int[] nums, int target) {
	        
	        return searchVal(nums,target,0,nums.length-1);
	        
	    }
	     public static boolean searchVal(int[] arr, int t,int l,int h) {
	        
	        if(l>h)
	            return false;
	         int mid=l+(h-l)/2;
	         if(arr[mid]==t)
	             return true;
	         if(arr[mid]==arr[l] && arr[h]==arr[mid]){
	             l++;
	             h--;
	             return searchVal(arr,t,l,h);
	         }
	         if(arr[l]<=arr[mid]){
	             if(t>=arr[l] && t<=arr[mid])
	                  return searchVal(arr,t,l,mid-1);
	             else
	               return searchVal(arr,t,mid+1,h);
	         }
	         else if(t<=arr[h] && t>=arr[mid])
	              return searchVal(arr,t,mid+1,h);
	         
	          return searchVal(arr,t,l,mid-1);
	        
	    }

}
