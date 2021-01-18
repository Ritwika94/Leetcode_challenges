package com.leetcode.november.Challenges;

import java.util.ArrayList;
import java.util.List;

public class PermutationsII {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		permuteUnique(nums);
		for(List<Integer> l:result) {
			System.out.print("[");
			for(Integer i:l) {
				System.out.print(i+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		
	}
	 static List<List<Integer>> result=new ArrayList();
	    public static List<List<Integer>> permuteUnique(int[] nums) {
	        int l=0;
	        int r=nums.length-1;
	        findPermut(l,r,nums);
	        return result;
	    }
	    public static void findPermut(int l,int r,int[] nums) {
	       if(l==r){
	           List<Integer> temp=new ArrayList();
	           for(int x:nums)
	               temp.add(x);
	           result.add(temp);
	           return;
	       }
	        //HashSet<Integer> set=new HashSet();
	        for(int i=l;i<=r;i++){
	            if(!canSwap(nums,l,i))
	                continue;
	            //set.add(i);
	            swap(nums,i,l);
	            findPermut(l+1,r,nums);
	            swap(nums,i,l);
	        }
	    }
	   public static  void swap(int[] nums, int i, int j){
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	    }
	     public static  boolean canSwap(int[] nums, int start,int curr){
	         for(int i=start;i<curr;i++){
	             if(nums[i]==nums[curr])
	                 return false;
	         }
	        return true; 
	     }

}
