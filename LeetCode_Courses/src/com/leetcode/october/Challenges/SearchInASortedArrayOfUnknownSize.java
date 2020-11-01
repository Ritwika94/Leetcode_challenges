package com.leetcode.october.Challenges;

public class SearchInASortedArrayOfUnknownSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int search(ArrayReader ar,int target) {
		int l=0;
		int r=1;
		while(ar.get(r)<target) {
			l=r;
			r*=2;
		}
		return binarysearch(ar,l,r,target);
	
	}
	private static int binarysearch(ArrayReader ar, int l, int r, int target) {
		while(l<=r) {
			int mid=l+(r-l)/2;
			if(ar.get(mid)==target)
				return mid;
			else if(mid>target)
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}

}
