package com.leetcode.november.Challenges;

import java.util.Arrays;

public class TwoSumLessThanK {

	public static void main(String[] args) {
		int[] arr= {34,23,1,24,75,33,54,8};
		int k=60;
		System.out.println(twoSumLessThanK(arr,k));
		int[] arr1= {10,20,30};
		int k1=15;
		System.out.println(twoSumLessThanK(arr1,k1));

	}
	public static int twoSumLessThanK(int arr[],int k) {
		Arrays.sort(arr);
		int l=0;
		int h=arr.length-1;
		int maxSum=-1;
		while(l<h) {
			if(arr[l]+arr[h]<k) {
				maxSum=Math.max(maxSum, arr[l]+arr[h]);
				l++;
			}
			else if(arr[l]+arr[h]>=k) {
			  h--;
			}
		}
		return maxSum;
	}

}
