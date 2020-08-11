package com.leetcode.mayChallenges;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int arr[]= {-2,4,-5,4,-5,9,4};
		int arr1[]= {1,-6,-7,4};
		//System.out.println(maxSubarraySumCircular(arr));
		System.out.println(maxSubarraySumCircular(arr1));

	}
	
public static int maxSubarraySumCircular(int[] A) {
	if(A.length==1)
		return A[0];
	int j=0;
	for( j=0;j<A.length;j++)
	{
		if(A[j]>0)
			break;
	}
	if(j==A.length)
	{
		int k=findmax(A);
		return k;
	}
	int n = A.length; 
	int max_sum = kandane(A); 
    int max_wrap  =  0; 
    for (int i = 0; i < n; i++) 
    { 
        max_wrap += A[i]; 
        A[i] = -A[i];  
    } 

    max_wrap = max_wrap + kandane(A); 
    return (max_wrap > max_sum)? max_wrap: max_sum;
  
}

public static int findmax(int[] a) {
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max<a[i])
			max=a[i];
	}
	return max;
}

private static int kandane(int[] A) {
	int max_sum=0;
	int max_so_far=0;
	for(int i=0;i<A.length;i++)
	{
		max_so_far+=A[i];
		if(max_so_far<0)
		{
			max_so_far=0;
		}
	if(max_sum<max_so_far)
	{
		max_sum=max_so_far;
	}
	
	}
	return max_sum;
}


}
