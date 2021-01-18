package com.leetcode.december.Challenges;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int findKthPositive(int[] arr, int k) {
	        int A[]=arr;
	        int l = 0, r = A.length, m;
	        while (l < r) {
	            m = (l + r + 1) / 2;
	            if (m == 0 || A[m - 1] - m < k) {
	                l = m;
	            } else {
	                r = m - 1;
	            }
	        }
	        return l + k;
	    }

}
