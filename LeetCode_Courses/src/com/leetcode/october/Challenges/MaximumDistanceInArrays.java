package com.leetcode.october.Challenges;

public class MaximumDistanceInArrays {

	public static void main(String[] args) {
		int[][] arr={{1,2,3},
				 {4,5},
				 {1,2,3}};
		System.out.println("Maximum distance is:"+maxDistance(arr));

	}
	public static int maxDistance(int[][] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int k=0,m=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]<min) {
				min=arr[i][0];
				k=i;
			}
			if(arr[i][arr[i].length-1]>max) {
				max=arr[i][arr[i].length-1];
				m=i;
			}
		}
		if(k!=m)
			return max-min;
		int min2=Integer.MAX_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(i==k)
				continue;
			min2=Math.min(min2, arr[i][0]);
		}
		for(int i=0;i<arr.length;i++) {
			if(i==m)
				continue;
			max2=Math.max(max2, arr[i][arr[i].length-1]);
		}
		if(max2-min>max-min2)
			return max2-min;
		
		return max-min2;
		
	}

}
