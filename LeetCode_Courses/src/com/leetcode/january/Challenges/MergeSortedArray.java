package com.leetcode.january.Challenges;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==0)
            return;
        int i=0;
        int j=0;
        int arr[]=new int[m+n];
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
               
                arr[k++]=nums1[i++];
            }
           else if(nums1[i]>nums2[j]){
              
                arr[k++]=nums2[j++];
            }
            else if(nums1[i]==nums2[j]){
                arr[k++]=nums1[i++];
                arr[k++]=nums2[j++];
               
            }
        }
        while(i<m)
             arr[k++]=nums1[i++];
        
         while(j<n)
             arr[k++]=nums2[j++];
        
        for(int pos=0;pos<arr.length;pos++)
            nums1[pos]=arr[pos];
    }

}
