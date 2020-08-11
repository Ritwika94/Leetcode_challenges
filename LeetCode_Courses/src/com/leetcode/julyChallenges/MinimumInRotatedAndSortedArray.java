package com.leetcode.julyChallenges;

public class MinimumInRotatedAndSortedArray {

	public static void main(String[] args) {
		int[] nums= {1,3,3};
		System.out.println(findMin(nums));

	}
	public static int findMin(int[] nums) {
		int l=0;
		int h=nums.length-1;
		
		return findminel(nums,l,h);
        
    }
	public static int findminel(int[] num, int left, int right) {
	if(right==left)
        return num[left];
    
    if(right == left +1){
        return Math.min(num[left], num[right]);
    }
   
 
    int middle = (right-left)/2 + left;
    
    if(num[right] > num[left]){
        return num[left];
    
    }else if(num[right] == num[left]){
        return findminel(num, left+1, right);
     
    }else if(num[middle] >= num[left]){
        return findminel(num, middle, right);
     
    }else{
        return findminel(num, left, middle);
    }
    }

}
